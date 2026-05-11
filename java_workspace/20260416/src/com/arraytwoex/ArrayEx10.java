package com.arraytwoex;

/*
 * 	문제)	2차원 배열을 이용하여 여러명에 대해서 성적처리를 하는 프로그램을 구현하시오.
 * 			단, 학생 수, 과목명을 입력받는다.
 * 	
 * 			점수, 총점, 평균, 학점, 석차
 */

import java.io.*;
public class ArrayEx10 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"국어", "영어", "수학"};
		int human = 0;
		System.out.print("학생 수 입력: ");
		human = Integer.parseInt(br.readLine());
		String[] name = new String[human];
		
		System.out.print("과목 수 입력: ");
		int n = 0;
		n = Integer.parseInt(br.readLine());
		String[] subject = new String[n];
		
		// 점수와 총점을 처리할 배열을 선언, 총점까지 배열에 들어가기 때문에  + 1을 한다.
		int[][] jumsu = new int[human][subject.length + 1];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		// str 배열에 저장된 과목명을 가져다가 subject 배열에 저장함
		for(int i = 0; i < subject.length; i++) {
			subject[i] = str[i];
		}
		
		// 사람 수 만큼 이름을 입력받고 각 과목별 점수 입력받고 총점을 구한다.
		for(int i = 0; i < human; i++) {
			// 이름을 입력받음
			System.out.print(i + 1 + "번째 학생입력: ");
			name[i] = br.readLine();
			// 학생별 과목별 점수를 입력받는다.
			System.out.println(name[i] + " 학생 점수입력");
			for(int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + " 점수: ");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // 각 과목별 점수입력
				// 총점을 구함
				jumsu[i][subject.length] = jumsu[i][subject.length] + jumsu[i][j];
			}
		} // 입력작업 끝
		
		// 평균
		for(int i = 0; i < human; i++) {
			avg[i] = (float)jumsu[i][subject.length] / subject.length;
			// 소수점 이하 셋째 자리에서 반올림처리
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;
		}
		
		// 학점
		for(int i = 0; i < human; i++) {
			switch((int)(avg[i] / 10)) {
				case 10:
				case 9:
					grade[i] = 'A';
					break;
				case 8:
					grade[i] = 'B';
					break;
				case 7:
					grade[i] = 'C';
					break;
				case 6:
					grade[i] = 'D';
					break;
				default :
					grade[i] = 'F';
					break;
			}
		}
		
		// 석차 구하기
		for(int i = 0; i < human; i++) {
			rank[i]++; // 1로 정함
			for(int j = 0; j < human; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println();
		System.out.println("=======성적표========");
		System.out.print("이름: ");
		for(int j = 0; j < subject.length; j++) {
			System.out.print(subject[j] + "\t");
		}
		System.out.println("총점\t평균\t학점\t석차");
		// 입력 데이터를 출력
		for(int i = 0; i < human; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < subject.length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println(jumsu[i][subject.length] + "\t" + 
			avg[i] + "\t" + grade[i] + "\t" + rank[i]);
		}
	}

}
