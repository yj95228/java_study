package com.edu.test;

import java.util.ArrayList;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("No, I mean it");
		list.add("Nice to see you");
		
		int i = 0;
		while(i <= 3) {
			try {
				System.out.println(list.get(i));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch 1");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Nice Catch 2");
			} finally {
				System.out.println("Always Print");
			}
			i++;				
		}
	}

}
