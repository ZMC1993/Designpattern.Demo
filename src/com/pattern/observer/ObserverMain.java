package com.pattern.observer;

public class ObserverMain {
	public static void main(String[] args) {
		Subject sb=new Subject(1);
		BinaryObserver bo=new BinaryObserver(sb);
		OctalObserver os=new OctalObserver(sb);
		HexaObserver hs=new HexaObserver(sb);

		sb.setState(2);
		sb.setState(100);
		
	}
}
