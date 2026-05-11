package com.collectionexam;

/*
 * 	문제) 
	사용자로부터 6개의 학점(A, B, C, D, F)을 문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여 학점에 점수로 변환하고,
 	평균을 출력하는 프로그램을 구현하시오.
	학점을 점수: A = 4.0, B = 3.0, C = 2.0, D = 1.0, F = 0
	결과
	6개의 학점 입력: A C A B F D
	평균: 2.3333333333333335
 */

import java.util.*;
public class CollectionExam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 문자를 저장할 ArrayList 객체 생성
		ArrayList<Character> arr = new ArrayList<Character>();
		
		for(int i = 0; i < 6; i++) { // 6개의 문자를 입력받아 ArrayList에 저장
			// A, B, C, D, F 학점 입력
			System.out.println("6개의 학점 입력: ");
			char ch = sc.next().charAt(0);
			
			// 학점을 유효 범위 체크 -> A, B, C, D, F
			
			// 학점인 경우 ArrayList에 추가
			if((ch >= 'A' && ch <= 'D') || ch == 'F') {
				arr.add(ch);
			}
			// 학점이 아닌 경우는 "학점을 잘못 입력 하셨습니다." 출력
			else {
				System.out.println("학점을 잘못 입력 하셨습니다.");
				return;
			}
		}
		System.out.println(arr);
		// 학점을 평균을 구함
		double hakjum = 0.0;
		
		for(int i = 0; i < 6; i++) {
			char ch = arr.get(i);
			switch(ch) {
			case 'A':
				hakjum += 4.0;
				break;
			case 'B':
				hakjum += 3.0;
				break;
			case 'C':
				hakjum += 2.0;
				break;
			case 'D':
				hakjum += 1.0;
				break;
			case 'F':
				hakjum += 0.0;
				break;
			}
		}
		
		double avg = hakjum / arr.size();
		System.out.println("평균: " + avg);
	}

}
