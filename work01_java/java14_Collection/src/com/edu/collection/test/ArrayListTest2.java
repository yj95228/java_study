package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

// Ordered
// index로 관리되는 것은 순서를 가지면서 저장되는 체계이다
// Set, Map은 내부적으로 index가 없다
public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("신동엽");
		list.add("이수근");
		list.add("성시경");
		list.add("신동엽");
		list.add("강호동");
		list.add("이휘재");

		
		System.out.println(list);
		
		// 1. 세번째 저장된 성시경님을 삭제
		String delName = list.remove(2);
		System.out.println(delName);
		
		// 2. 두번째 위치에 아이유를 추가
		list.add(1, "아이유");
		System.out.println(list);
		
		// 3. 네번째 사람의 이름을 히밥으로 수정
		list.set(3, "히밥");
		System.out.println(list);
		
		// 4. 다섯번째 멤버를 찾아서 출력
		System.out.println(list.get(4));
		
		// 5. 모든 데이터를 삭제... 비었는지 여부 확인
		list.clear();
		System.out.println(list.isEmpty());
	}

}
