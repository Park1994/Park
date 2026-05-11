package com.arrayex;

/*
 * 	문제)	최대값과 최소값 구하기
 * 			79, 88, 91, 33, 100, 55, 95
 * 
 * 			배열에 저장된 값 중 최대값과 최소값을 구하는 프로그램을 구현하시오.
 */

public class ArratEx08 {

	public static void main(String[] args) {
		// hit -> 배열에 첫번째 값이 최대값,
		// hit -> 배열에 첫번째 값이 최소값,
		
		int[] arr = {79, 88, 91, 33, 100, 55, 95};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] > max) {
				max = arr[i];
			}
			else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
