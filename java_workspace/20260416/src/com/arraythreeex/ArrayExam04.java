package com.arraythreeex;

/*
 * 	아래의 과목과 점수가 짝을 이루도록 2개의 배열을 작성하고
 * 	과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하시오.
 * 	단, "그만" 을 입력하면 프로그램을 종료한다.
 * 
 * 	String course[] = {"HTML", "JAVA", "DATABASE", "JSP", "SPRING"};
 * 	int score[] = {95, 88, 76, 62, 55};
 * 	
 * 	과목이름: jaba
 * 없는 과목입니다.
 * 과목이름: JAVA
 * JAVA의 점수는 88
 * 
 * 과목이름: 그만
 *	hit) 문자열을 비교할 때는 equas() 메소드를 이용함
 *			== 비교연산자 문자열에서는 사용할 수 없음
 *		if(course[i].equals(name)) { // 과목명이 내가 입력한 문자열과 같으면
 *			int n = score[i];
 *		}
 */

import java.util.*;
public class ArrayExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] course = {"HTML", "JAVA", "DATABASE", "JSP", "SPRING"};
		int score[] = {95, 88, 76, 62, 55};
		String a = "";
	
//		for(;;) {
//			while(true) {
//				System.out.print("과목이름: ");
//				a = sc.nextLine();
//				
//				if(a.equals("그만")) {
//					System.out.println("프로그램을 종료합니다.");
//					return;
//				}
//			}
//		}
		
//		for(int i = 0; i < course.length; i++) {
//			System.out.print("과목이름: ");
//			a = sc.nextLine();
//			if(course[i].equals(a)) {
//				System.out.println(a + "의 점수는 " + score[i]);
//				break;
//			}
//			// 입력한 과목이 course 배열에 저장되어 있지 않으면
//			if(i == course.length) {
//				System.out.println("없는 과목입니다.");
//			}
//		}
		while(true) {
			System.out.print("과목이름: ");
			a = sc.nextLine();
			if(a.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			int i = 0;
			for(i = 0; i < course.length; i++) {
				if(course[i].equals(a)) {
					System.out.println(a + "의 점수는 " + score[i]);
					break;
				}	
			}
			if(i == course.length) {
				System.out.println("없는 과목입니다.");
			}
		}
	}
}
	


