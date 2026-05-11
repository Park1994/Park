package com.mapex;

/*
 * 	Map 인터페이스 -> HashMap, TreeMap
 * 	-Key와 Value를 매핑하는 객체이다.
 * 	-Key는 절대 중복될 수 없으며, 각 키는 1개의 값만 가질 수 있다.
 * 	-정렬의 기준은 없으며 키로 각 값을 참조할 수 있다.
 * 
 * 	-사용자가 원하는 값의 키를 알고 싶다면 키를 가지고 와서 해당 키와
 * 	매핑되어 있는 값을 얻어오는 구조임
 * 	-> 검색을 키로 해야하므로 키를 모르면 원하는 값을 얻지 못한다.
 */

import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		System.out.println(map);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해 주세요.");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			System.out.print("password: ");
			String password = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해 주세요.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
			}
			else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}

}
