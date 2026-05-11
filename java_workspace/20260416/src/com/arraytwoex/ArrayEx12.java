package com.arraytwoex;

import java.io.*;
public class ArrayEx12 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int human = 0;
		System.out.print("학생 수 입력: ");
		human = Integer.parseInt(br.readLine());
		String[] name = new String[human];
		
		// 레기드 배열로 지정
		String[][] subject = new String[human][];
		int[][] jumsu = new int[human][];
		
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		// ☆☆☆☆☆
		// 응시 과목
		for(int i = 0; i < human; i++) {
			System.out.print("이름 입력: ");
			name[i] = br.readLine();
			
			System.out.print("과목 수 입력: ");
			int imsi = Integer.parseInt(br.readLine());
			
			// 가변 배열, 레기드 배열, 비정형 배열로 과목 수 만큼 과목이름과 점수를 입력받는다.
			subject[i] = new String[imsi];
			for(int j = 0; j < subject[i].length; j++) {
				System.out.print(j + 1 + " 과목명: ");
				subject[i][j] = br.readLine();
			}
			// 입력받은 과목 수만큼 점수를 입력받음
			// 입력받은 점수를 저장할 공간을 레기드 배열로 다시 선언
			jumsu[i] = new int[imsi + 1];
			for(int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "과목 점수: ");
				// 과목 점수를 입력받음
				jumsu[i][j] = Integer.parseInt(br.readLine());
				// 입력받은 과목의 합계를 계산함
				jumsu[i][jumsu[i].length - 1] += jumsu[i][j];
				// System.out.println(jumsu[i][jumsu[i].length - 1]);
			}
			System.out.println();
		} // 이름 입력, 과목 수 입력, 과목별 점수 입력, 점수들의 총합계
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
			for(int i = 0; i < human; i++) {
				System.out.println("=======성적표========");
				System.out.print("이름: ");
					for(int j = 0; j < subject[i].length; j++) {
						System.out.print(subject[i][j] + "\t");
					}
				
				System.out.println("총점\t평균\t학점\t석차");
				// 입력 데이터를 출력
				System.out.print(name[i] + "\t");
				for(int j = 0; j < jumsu[i].length; j++) {
					System.out.print(jumsu[i][j] + "\t");
				}
				System.out.println(avg[i] + "\t" + grade[i] + "\t" + rank[i]);
				System.out.println();
			}
	}
}

