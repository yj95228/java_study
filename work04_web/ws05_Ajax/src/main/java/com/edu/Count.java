package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Count {

	public String execute(String book) {
		String word = "";
		int cnt = 0;
		TreeMap<String,Integer> map = new TreeMap<>();
		String[] books = book.split(" ");
		for(String bb: books) {
			String b = bb.toLowerCase();
			map.put(b, map.getOrDefault(b, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > cnt) {
		    	word = entry.getKey();
		        cnt = entry.getValue();
		    }
		}
		return word;
	}

 public static void main(String[] args) {
		String book1 ="Can Danny and his father outsmart the villainous Mr. Hazell? Danny has a life any boy would love - his home is a gypsy caravan, he's the youngest master car mechanic around, and his best friend is his dad, who never runs out of wonderful stories to tell. But one night Danny discovers a shocking secret that his father has kept hidden for years. "; 
		String book2 ="Soon Danny finds himself the mastermind behind the most incredible plot ever attempted against nasty Victor Hazell, a wealthy landowner with a bad attitude. Can they pull it off? If so, Danny will truly be the champion of the world.";
		String book3 ="I like cat. I like cat. I like cat. ";
		Count c = new Count();
		System.out.println(c.execute(book1));
		System.out.println(c.execute(book2));
		System.out.println(c.execute(book3));

	}

}
