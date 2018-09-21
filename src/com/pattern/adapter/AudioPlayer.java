package com.pattern.adapter;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter=new MediaAdapter();
	
	@Override
	public void play(String filetype, String filename) {
		// TODO Auto-generated method stub
		switch(filetype) {
		case "mp3":{
			System.out.printf("AudioPlayer is paly: %s%n", filename);
			break;
		}
		case "mp4":{
			mediaAdapter.play(filetype, filename);
			break;
		}
		case "vlc":{
			mediaAdapter.play(filetype, filename);
			break;
		}
		default:{
			System.out.println("The filetype is not support");
		}
		}
		
	}

}
