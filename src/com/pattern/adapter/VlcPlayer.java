package com.pattern.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		System.out.printf("VlcPlayer is play : %s%n", filename);
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub

	}

}
