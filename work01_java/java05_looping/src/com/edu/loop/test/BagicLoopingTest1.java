package com.edu.loop.test;

public class BagicLoopingTest1 {

	public static void main(String[] args) {
		System.out.println("====== for ======");
		for(int i = 0; i < 10; i++)
			System.out.println(i+"번째 Looping...");
		
		System.out.println("===== while =====");
		int i = 10;
		while(i > 0) {
			System.out.println(i+"번째 Looping...");
			i--;
		}
	}

}
