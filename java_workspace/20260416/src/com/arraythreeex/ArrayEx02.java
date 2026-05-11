package com.arraythreeex;

/*
 * 	반 -> 2
 * 학생 수 -> 3
 * 과목 -> 3(국, 영, 수)
 * 
 * 저장공간: 면 * 행 * 열 -> 18
 */

import java.io.*;
public class ArrayEx02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"};
		int[][][] sub = new int[2][2][subname.length + 3];
		// 0: 국어 1: 영어 2: 수학 3: 총점 4: 반 석차 5: 전교 석차
		float[][] avg = new float[2][3];
		
		for(int h = 0; h < sub.length; h++) { // 반
			System.out.println((h + 1) + "반");
			for(int k = 0; k < sub[h].length; k++) { // 학생
				System.out.println((k + 1) + "번째 학생");
				for(int i = 0; i < sub[h][k].length - 3; i++) { // 과목
					// 점수 입력받고 총점 구하고
					do {
						System.out.print(subname[i] + " 점수: ");
						sub[h][k][i] = Integer.parseInt(br.readLine());
					} while(sub[h][k][i] < 0 || sub[h][k][i] > 100);
					// 총점을 구함
					sub[h][k][sub[h][k].length - 3] += sub[h][k][i];
				}
				// 평균, 반 석차, 전체 석차
				// 평균 
				avg[h][k] = sub[h][k][sub[h][k].length - 3] / (float)sub[h][k].length - 3;
				// 반 석차 초기화
				sub[h][k][sub[h][k].length - 2] = 1;
				// 전교 석차 초기화
				sub[h][k][sub[h][k].length - 1] = 1;
			}
			System.out.println();
		}
		// 반 석차
		for(int h = 0; h < sub.length; h++) {
			for(int k = 0; k < sub[h].length; k++) {
				for(int i = 0; i < sub[h].length; i++) {
					if(sub[h][k][sub[h][k].length - 3] < sub[h][i][sub[h][i].length - 3]) {
						sub[h][k][sub[h][k].length - 2]++;
					}
				}
			}
		}
		// 전교 석차
		for(int h = 0; h < sub.length; h++) {
			for(int k = 0; k < sub[h].length; k++) {
				// 반과 반
				
				for(int i = 0; i < sub.length; i++) {
					for(int j = 0; j < sub[i].length; j++) {
						if(sub[h][k][sub[h][k].length - 3] < sub[i][j][sub[i][j].length - 3]) {
							sub[h][k][sub[h][k].length - 1]++;
						}
					}
				}
				
			}
		}
		//결과 출력
		for(int h = 0; h < sub.length; h++) {
			for(int k = 0; k < sub[h].length; k++) {
				System.out.println();
				System.out.println("총점: " + sub[h][k][sub[h][k].length - 3]);
				System.out.printf("평균: %.2f%n", avg[h][k]);
				System.out.println("반 석차: " + sub[h][k][sub[h][k].length - 2] + "등");
				System.out.println("전교 석차: " + sub[h][k][sub[h][k].length - 1] + "등");
			}
		}
	}

}
