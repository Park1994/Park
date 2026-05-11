package com.ifexam;

/*
 * 문제) 3과목의 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
 * 단, 총점은 정수로 평균은 소수점 이하 2자리까지 출력하시오.
 */

import java.io.*;
// import java.util.*; 스캐너를 이용할 때
public class IfEx06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Scanner sc = new Scanner(System.in);
		
		// int kor, eng, math, sum = 0;
		// double aver = 0;
		int kor, eng, math, sum;
		double aver;
		char grade = ' ';
		
		// System.out.print("국어 점수: ");
		// kor = sc.nextInt();
		// System.out.print("영어 점수: ");
		// eng = sc.nextInt();
		// System.out.print("수학 점수: ");
		// math = sc.nextInt();
		System.out.print("국어 점수: ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수: ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수: ");
		math = Integer.parseInt(br.readLine());
		
		// sum = kor + eng + math;
		// aver = sum / 3;
		sum = kor + eng + math;
		aver = sum / 3.0;
		
		// System.out.println("당신의 총점은: " + sum + "입니다.");
		// System.out.printf("평균은 %.2f 이고 ", aver);
		
		if(aver >= 90) {
			grade = 'A';
		} else if (aver >= 80 && aver < 90) {
			grade = 'B';
		} else if (aver >= 70 && aver < 80) {
			grade = 'C';
		} else if (aver >= 60 && aver < 70) {
			grade = 'D';
		} else if (aver < 60) {
			grade = 'F';
		}
		
		// System.out.println("당신의 학점은: " + grade + "입니다.");
		System.out.printf("총점은 %d이고, 평균은 %.2f, 학점은 %c입니다.", sum, aver, grade);
	}

}
