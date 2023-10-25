package com.edu.oop.test;

import com.edu.oop.NoteBook;
import com.edu.oop.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.setNoteBook(111, "SAMSUNG", 1500000);
		
		Programmer pr = new Programmer();
		pr.setProgrammer("James", "JAVA", 30000);
		pr.setNoteBook(nb);
		
		System.out.println("===James의 정보를 출력합니다===");
		pr.printConsoleInfo();
	}

}
