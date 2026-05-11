package com.arraytwoex;

/*
 * 	문제)	5명의 학생의 3과목을 더해서 각 학생의 총점과 평균을 구하는 프로그램을 구현하시오.
 * 			또한 각 과목별 총점을 계산하여 출력하시오.
 * 			2차원 배열을 활용하여 점수를 초기화 시킨다음 진행하도록 한다.
 * 			
 * 			100, 100, 100
 * 			20,	20,	20
 * 			30,	30,	30
 * 			40,	40,	40
 * 			50,	50,	50
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[][] a = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};
		
		int sum = 0;
		int ksum = 0;
		int esum = 0;
		int msum = 0; // 국어, 영어, 수학의 합계 변수 선언
		float avg = 0.0f;
		// 과목별 총점을 합
		System.out.println("번호   국어   영어   수학   총점   평균");
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) { // 과목별 점수 합계
				ksum = ksum + a[i][0];
				esum = esum + a[i][1];
				msum = msum + a[i][2];
			}
			System.out.printf("%2d", i + 1);
			
			for(int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
			avg = (float)sum / a[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.printf("합계: %3d %4d %4d%n", ksum, esum, msum);
	}
	

}
