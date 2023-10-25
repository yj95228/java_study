package com.edu.loop.test;

public class BagicLoopingTest2 {

	public static void main(String[] args) {
		System.out.println("===== break =====");
		int total = 0;
		for(int member = 1; member <= 10; member++) {
			if(total >= 30) break;
			total += member;
		}
		
		System.out.println("total: "+total);
		
		
		System.out.println("==== continue ====");
		int total2 = 0;
		for(int num = 1; num <= 10; num++) {
			if(num%2 == 0) continue;
			total2 += num;
		}
		
		System.out.println("total2: "+total2);
	}

}
