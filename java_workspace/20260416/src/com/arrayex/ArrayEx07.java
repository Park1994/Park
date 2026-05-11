package com.arrayex;

/*
 * 	문제)	배열에 저장된 값에 총점과 평균을 구하는 프로그램을 구현하시오.
 * 			100, 88, 100, 100, 90
 */

public class ArrayEx07 {

	public static void main(String[] args) {
		
		float avg = 0.0f;
		int sum = 0;
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = (float)sum / score.length;
		System.out.println("총점은 " + sum + "이고 평균은 " + avg + "입니다.");
	}

}
