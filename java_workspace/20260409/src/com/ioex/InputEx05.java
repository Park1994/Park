package com.ioex;

/*
 * 숫자가 하나 이상(숫자열: 두 자리 이상) 입력 받기
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String imsi = br.readLine();
 * 
 * 문자열을 숫자욜로 바꾸어 주는 메소드
 * int i = Integer.parseInt(imsi);
 * 
 * 문제) 세 과목을 점수를 입력받아 총점을 구하는 프로그램을 구현하시오.
 * 세 과목: 국어, 영어, 수학
 */

import java.io.*;
public class InputEx05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 각 과목 점수를 입력받아 저장할 변수 선언
		int kor, eng, mat, hap;
		
		System.out.print("국어 점수: ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수: ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수: ");
		mat = Integer.parseInt(br.readLine());
		hap = kor + eng + mat;
		System.out.println("세 과목의 총점은 " + hap + "점 입니다.");
	}

}
