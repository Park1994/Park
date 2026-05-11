package com.arraytwoex;

/*
 * 	다차원 배열(2차원, 3차원)
 * 		-행과 열로 이루어져 있다.
 * 		-1차원은 행 만으로 이루어져 있는데, 2차원 배열은 열이 추가되어 행과 열로 이루어진다.
 * 
 * 	2차원 배열 선언
 * 		1. 자료형(데이터 타입)[][] 배열명;
 * 		2. 자료형 배열명[][];
 * 		3. 자료형[] 배열명[];
 * 
 * 	2차원 배열의 초기화
 * 		배열명 = new 자료형[행의 크기][열의 크기];	-정형배열
 * 		배열명 = new 자료형[행의 크기][];	-가변배열, 레기드배열, 비정형배열
 * 		배열명 = {{1, 2}, {3, 4}, {5, 6}}	-행이 3, 열이 2, 행은 ,로 구분하게 된다.
 * 															{}: 행을 의미하며, 행을 구분할 때는 ,로 한다.
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 2행 3열의 크기를 가진 2차원 배열을 선언하시오.
		// 배열명 test
		// 2차원 배열선언
//		int[][] test;	// 배열선언
		
		// 배열의 초기화
//		test = new int[2][3];
		
		int[][] test = new int[2][3];
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		for(int i = 0; i < test.length; i++) { // 행	 test.length는 행을 의미한다.
			for(int j = 0; j < test[i].length; j++) { // 열	test[i].length를 입력해야 열을 의미한다.
//	test[i].length -> test[i]는 행을 의미 .length는 열을 의미함
				System.out.printf("%d \t", test[i][j]);
			}
			// 줄바꿈 -> 열의 작업을 다 마치고 다음 행으로 넘어가기 위한 작업
			System.out.println();
		
//		// 배열에 저장된 값 출력
//		for(int i = 0; i < 2; i++) { // 행
//			for(int j = 0; j < 3; j++) { // 열
//				System.out.printf("%d \t", test[i][j]);
//			}
//			// 줄바꿈 -> 열의 작업을 다 마치고 다음 행으로 넘어가기 위한 작업
//			System.out.println();
		}
	}

}
