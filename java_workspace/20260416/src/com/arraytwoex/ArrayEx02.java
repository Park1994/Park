package com.arraytwoex;

/*
 * 	
 */

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 및 초기화
		int[][] arr = {{100, 		200, 		300}, // 첫번째 행을 의미하며 행을 구분할 때는 ,로 한다.
							{400, 		500, 		600}}; // 두번째 행
						//	첫번째 열,  두번째 열,   세번째 열
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.printf("%d \t", arr[i][j]);
//			}
//			System.out.println();
		
		int sum = 0;
		
		for(int[] t : arr) { // arr의 각 인덱스를 t에 저장함
			for(int i : t) { // t는 1차원 배열 가리키는 참조변수
				System.out.print(i + "\t");
				sum = sum + i;
			}
			System.out.println();
		}
		System.out.println("합계: " + sum);
	}

}
