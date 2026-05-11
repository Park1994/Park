package com.classex.ex01;

/*
 * 	문제)	Grade 클래스를 완성하시오.
 * 			세 과목의 점수를 입력받아 Grade 객체를 생성하고
 * 			성적과 평균을 출력하는 프로그램을 완성하시오.
 * 			main() 메소드는 다음과 같이 구현한다.
 * 
 * 			출력 결과
 * 			국어 영어 수학 순으로 세 과목의 점수 입력: 90 88 96
 * 			평균은 91점 입니다.
 */

import java.util.*;
public class Grade {
	// int 자료형의 국어, 영어, 수학 필드를 private로 선언
	private int kor;
	private int eng;
	private int mat;
	
	// 생성자와 세 과목의 평균을 리턴하는 average() 메소드를 작성하시오.
	public Grade(int a, int b, int c) {
		this.kor = a;
		this.eng = b;
		this.mat = c;
	}
	
	public double average() {
		return (kor + eng + mat) / 3.0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 순으로 세 과목의 점수 입력: ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Grade me = new Grade(kor, eng, mat);
		System.out.printf("평균은 %.2f 입니다.", me.average());
	}

}
