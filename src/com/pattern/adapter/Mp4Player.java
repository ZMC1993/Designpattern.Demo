package com.pattern.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.printf("Mp4Player is play :%s%n", filename);
	}

}
