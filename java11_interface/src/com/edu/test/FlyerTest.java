package com.edu.test;

import com.edu.child.Bird;
import com.edu.child.SuperMan;
import com.edu.parent.Flyer;

public class FlyerTest {

	public static void main(String[] args) {
		// Flyer f = new Flyer();
		Flyer f1 = new Bird();
		Flyer f2 = new SuperMan();
		
		f1.fly();
		System.out.println(((Bird) f1).layEggs());
	}

}
