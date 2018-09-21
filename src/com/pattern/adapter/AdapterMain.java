package com.pattern.adapter;

public class AdapterMain {
	public static void main(String[] args) {
		AudioPlayer ap=new AudioPlayer();
		ap.play("mp3", "1.mp3");
		ap.play("mp4", "2.mp4");
		ap.play("vlc", "3.vlc");
		ap.play("exe", "1.exe");
	}
}
