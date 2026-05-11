package com.arrayex;

/*
 * 	문제)	임의의 숫자가 들어있는 배열의 숫자 데이터 중 짝수인 요소와 3의 배수만을 골라서 출력하시오.
 * 			
 * 			배열에 저장된 숫자: 4 7 9 1 3 2 5 6 8
 * 
 * 			출력 결과
 * 			배열의 값 전체 출력
 * 			짝수 출력
 * 			4 2 6 8
 * 			홀수 출력
 * 			9 3 6
 */


public class ArrayEx04 {

	public static void main(String[] args) {
		
		System.out.println("배열에 저장된 값");
		int[] a = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println("짝수 출력");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("3의 배수 출력");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 3 == 0) {
				System.out.print(a[i] + "\t");
			}
		}
	}

}
