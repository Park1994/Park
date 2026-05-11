package com.arrayex;

/*
 * 	배열의 개념
 * 1. 배열은 같은 자료형들끼리 모아둔 하나의 묶음이다.
 * 		배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 * 	2. 자바에서 하나의 배열은 하나의 객체로 인식된다.
 * 3. 같은 자료형이 여러 개 반복될 때 이를 하나의 변수명으로 관리하며,
 * 		각각의 구분은 순차적인 첨자(인덱스)를 사용한다.
 * 		첨자의 시작은 0에서부터 시작
 * 	4. 참조 자료형(객체 == 배열)의 크기는 4byte이다.
 * 		
 * 	1차원 배열
 * 	배열의 선언방법
 * 	int[] 배열명; 또는 int 배열명[];
 *  
 *	배열의 초기화
 *	배열명 = new 자료형[개수]
 *	배열명 = {값1, 값2, 값3}
 *	배열명 = new 자료형[]{값1, 값2, 값3}
 *
 *	*****
 *	new에 의해서 할당되면 자동으로 초기화된다.
 *	->
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 1차원 배열선언
//		int[] score = new int[5]; // 첫 번째 방법
		int score[] = new int[5]; // 두 번째 방법
//		int[] score; 					// 세 번째 방법
//		score = new int[5];
//		score[0] = 50;
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		int v = 1;
		for(int i = 0; i < score.length; i++) {
			score[i] = (v * 10) + 40;
			v++;
		}
//		for(int i = 0; i < score.length; i++) {
//			score[i] = ((i + 1) * 10) + 40;
//		}
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
		
		// 배열을 활용 반복문
		for(int t : score) {
			System.out.print(t + "\t");
		}
		System.out.println();
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		for(int i = 0; i < 4; i++) {
			System.out.print(ch[i] + "\t");
		}
		System.out.println();
		for(char aa : ch) {
			System.out.print(aa + "\t");
		}
		System.out.println();
	}

}
