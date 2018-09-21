package com.pattern.transferObject;

public class TransferObjectMain {
	public static void main(String[] args) {
		StudentBO sb=new StudentBO();
		
		for(StudentVO s:sb.getStudents()) {
			System.out.println(s.getName()+":"+s.getRollNo());
		}
		StudentVO stu=sb.getStudent(0);
		sb.delete(stu);
		for(StudentVO s:sb.getStudents()) {
			System.out.println(s.getName()+":"+s.getRollNo());
		}
		
	}
}
