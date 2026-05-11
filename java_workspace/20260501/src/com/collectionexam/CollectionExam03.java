package com.collectionexam;

/*
 * 	문제)
	"그만" 이 입력될 때 까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름받아 인구를 출력하는 프로그램을 구현하시오.
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	출력결과
	나라 이름과 인구를 입력하세요.
	나라 이름 인구: Korea 5000
	나라 이름 인구: USA 100000
	나라 이름 인구: Swiss 2000
	나라 이름 인구: France 3000
	나라 이름 인구: Japan 3000
	나라 이름 인구: 그만
	인구 검색: France
	France의 인구는 3000
	인구 검색: 중국
	중국 나라는 없습니다.
	인구 검색: 그만
	프로그램을 종료합니다.
 */

import java.util.*;
public class CollectionExam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.");
		
		while(true) {
			System.out.print("나라 이름 인구: ");
			String s = sc.next();
			if(s.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int n = sc.nextInt();
			nations.put(s, n);
		}
		System.out.println(nations);
		
		while(true) {
			System.out.print("인구 검색: ");
			String s = sc.next();
			if(s.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			Integer n = nations.get(s);
			if(n == null) {
				System.out.println(s + "나라는 없습니다.");
			}
			else {
				System.out.println(s + "의 인구는 " + n);
			}
		}
	}

}
