package com.pattern.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvanceMediaPlayer advanceMediaPlayer;
	
	
	@Override
	public void play(String filetype, String filename) {
		// TODO Auto-generated method stub
		switch (filetype) {
		case "vlc":{
			advanceMediaPlayer=new VlcPlayer();
			advanceMediaPlayer.playVlc(filename);
			break;
		}
		case "mp4":{
			advanceMediaPlayer=new Mp4Player();
			advanceMediaPlayer.playMp4(filename);
		}
		}
	}

}
