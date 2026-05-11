package com.arrayex;

/*
 * 	문제)	세 과목의 점수를 입력받아 총점과 평균을 구하는 프로그램을 구현하시오.	
 */

import java.util.*;
public class ArrayExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int sum = 0;
		float avg = 0.0f;
		
		do {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
		} while(kor < 0 || kor > 100);
			
		do {
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
		} while(eng < 0 || eng > 100);
		
		do {
			System.out.print("수학 점수: ");
			mat = sc.nextInt();
		} while(mat < 0 || mat > 100);
		
		sum = kor + eng + mat;
		avg = sum / 3.0f;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: "+ avg);
	}

}
