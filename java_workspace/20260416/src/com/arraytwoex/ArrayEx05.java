package com.arraytwoex;

/*
 * 	문제)	아래와 같이 출력되도록 프로그래밍 하시오.
 * 			1 2 3 4 5
 * 			2 3 4 5 6
 * 			3 4 5 6 7
 * 			4 5 6 7 8
 * 			5 6 7 8 9
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[][] a;
		a = new int[5][5];
		int b = 1;
		
		// 데이터를 반복문을 이용하여 초기화함
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = a[i][j] + b;
				b++;
			}
			b = i + 2;
		}
		
		// 배열에 저장된 데이터 출력
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%d \t", a[i][j]);
			}
			System.out.println();
		}
		
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				a[i][j] = a[i][j] + b;
//				b++;
//				System.out.printf("%d \t", a[i][j]);
//			}
//			System.out.println();
//			b = b - 4;
		}
	}

