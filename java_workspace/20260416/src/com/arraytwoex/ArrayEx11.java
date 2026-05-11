package com.arraytwoex;

/*
 *	가변 배열, 레기드 배열, 비정형 배열 
 *	2차원 이상에 배열을 생성할 때 행의 길이는 고정이지만 열의 길이는 다시 조절 가능하다.
 *	고정형태가 아닌 보다 유동적인 가변 배열을 구성하게 된다.
 */

public class ArrayEx11 {

	public static void main(String[] args) {
//		int[][] arr = new int[3][5]; // 정형배열, 고정배열
//		
//		int[][] arr1 = new int[3][];
//		// 행은 지정하고, 열의 길이는 지정하지 않는다.
//		arr1[0] = new int[2]; // 첫번째 행의 열의 길이는 2개
//		arr1[1] = new int[4]; // 두번째 행의 열의 길이는 4개
//		arr1[2] = new int[3]; // 세번째 행의 열의 길이는 3개
//		
//		int[][] arr2 = {{100, 100}, {20, 20, 30, 50}, {50, 50}};
//		
		int[][] arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		int[][] arr3 = new int[4][];
		for(int a = 0; a < arr3.length; a++) {
//			arr3[a] = new int[a + 1];
			for(int b = 0; b < arr3[a].length; b++) {
				arr3[a][b] = (a + 1) * 10 + b;
			}
		}
			
//		for(int x = 0; x < arr2.length; x++) {
//			for(int y = 0; y < arr2[x].length; y++) {
//				System.out.printf("%3d \t", arr2[x][y]);
//			}
//			System.out.println();
//		}
//		System.out.println();	
//		
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				System.out.printf("%3d \t", arr1[i][j]);
//			}
//			System.out.println();
		}
	}


