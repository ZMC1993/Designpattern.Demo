package com.pattern.iterator;

public class IteratorMain {
	public static void main(String[] args) {
		NameRepository names=new NameRepository();
		for(Iterator i=names.getIterator();i.hasNext();) {
			System.out.println(i.next().toString());
		}		
	}
}
