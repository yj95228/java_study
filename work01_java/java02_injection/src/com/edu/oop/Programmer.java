package com.edu.oop;

public class Programmer {
	public String name;
	public String mainSkill;
	public int salary;
	
	public NoteBook noteBook;
	
	// Field Initialization
	public void setProgrammer(String name,
							  String mainSkill,
							  int salary) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
	}
	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	// 정보를 콘솔창에 출력하는 기능
	public void printConsoleInfo() {
		System.out.println(name+","+mainSkill+","+salary+","+noteBook.printInfo());
	}
}
