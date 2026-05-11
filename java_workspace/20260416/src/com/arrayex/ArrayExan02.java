package com.arrayex;

import java.util.Scanner;
public class ArrayExan02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 국어, 영어, 수학 배열로 선언
		String[] subname = {"국어점수", "영어점수", "수학점수"};
		
		// 배열의 길이: 4 -> 0: 국어, 1: 영어, 2: 수학, 3: 합계
		int[] sub =new int[subname.length + 1];
		
//		int kor = 0;
//		int eng = 0;
//		int mat = 0;
//		int sum = 0;
		// 평균을 저장할 변수
		float avg = 0.0f;
		for(int i = 0; i < sub.length - 1; i++) {
			do {
				System.out.print(subname[i] + ": ");
				sub[i] = sc.nextInt();
			} while(sub[i] < 0 || sub[i] > 100);
			// 합계를 구함
			sub[sub.length - 1] = sub[sub.length - 1] + sub[i];
		}
		avg = sub[sub.length - 1] / (float)(sub.length - 1);
		
//		do {
//			System.out.print("국어 점수: ");
//			kor = sc.nextInt();
//		} while(kor < 0 || kor > 100);
//			
//		do {
//			System.out.print("영어 점수: ");
//			eng = sc.nextInt();
//		} while(eng < 0 || eng > 100);
//		
//		do {
//			System.out.print("수학 점수: ");
//			mat = sc.nextInt();
//		} while(mat < 0 || mat > 100);
		
//		sum = kor + eng + mat;
//		avg = sum / 3.0f;
		
		System.out.println("총점: " + sub[sub.length - 1]);
		System.out.println("평균: "+ avg);
		
	}

}
