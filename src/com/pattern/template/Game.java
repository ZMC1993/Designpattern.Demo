package com.pattern.template;

public abstract class Game {
	public final void play() {
		init();
		begin();
		end();
	};
	public abstract void init();
	public abstract void begin();
	public abstract void end();
}
