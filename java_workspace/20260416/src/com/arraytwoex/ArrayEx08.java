package com.arraytwoex;

/*
 * 	문제)	2차원 배열에 학년별 1, 2학기 성적을 저장하고
 * 			4년간의 전체 평점 평균을 구하는 프로그램을 구현하시오.
 */

public class ArrayEx08 {

	public static void main(String[] args) {
		
		//	평점을 저장할 배열을 선언
		double jumsu[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 3.8}, {3.9, 4.0}};
		double sum = 0.0;
		
		for(int i = 0; i < jumsu.length; i++) {
			for(int j = 0; j < jumsu[i].length; j++) {
				sum = sum + jumsu[i][j];
			}
		}
		int a = jumsu.length;
		System.out.println(a);
		int b = jumsu[0].length;
		System.out.println(b);
		System.out.println("4년 전체 평점 평균은 " + sum / (a * b));
	}

}
