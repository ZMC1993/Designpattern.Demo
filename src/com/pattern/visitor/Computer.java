package com.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
	private List<ComputerPart> parts=new ArrayList<ComputerPart>();
	
	public Computer() {
		parts.add(new Keyboard());
		parts.add(new Monitor());
		parts.add(new Mouse());
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for(ComputerPart p: parts) {
			p.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
