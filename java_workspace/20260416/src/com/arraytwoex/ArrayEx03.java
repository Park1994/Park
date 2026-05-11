package com.arraytwoex;

/*
 * 	문제)	2차원 배열을 활용하여 아래와 같이 출력되도록 프로그래밍 하시오.
 * 			
 * 			1		2		3		4		5
 * 			6		7		8		9		10
 * 			11		12		13		14		15
 * 			16		17		18		19		20
 * 			21		22		23		24		25
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[][] a;
		a = new int[5][5];
		
		int b = 1;
		// 1부터 시작하기 때문에 변수 1 초기화
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = b;
				b++;
			}
		} // 값을 배열에 입력
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%02d \t", a[i][j]);
			}
			System.out.println();
		} // 배열에 있는 값을 출력
	}

}
