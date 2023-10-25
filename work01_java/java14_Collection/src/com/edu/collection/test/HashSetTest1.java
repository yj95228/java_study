package com.edu.collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Unique
 * 중복 없고 / 순서 없음
 */
public class HashSetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("탁재훈");
		set.add("이수근");
		set.add("강호동");
		set.add("김준호");
		set.add("이수근");
		System.out.println(set);
		
		// 1. set에 저장된 데이터의 개수를 출력
		System.out.println(set.size());
		
		// 2. 김준호라는 멤버가 저장되어 있는지 확인
		System.out.println("김준호 들어있나요? "+set.contains("김준호"));
		
		// 3. 김준호를 삭제
		set.remove("김준호");
		System.out.println(set);
		
		// 4. 모든 멤버 삭제
		set.clear();
		
		// 5. set이 비워졌는지를 확인
		System.out.println(set.isEmpty());
	}

}
