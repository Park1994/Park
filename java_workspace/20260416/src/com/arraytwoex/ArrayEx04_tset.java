package com.arraytwoex;
/*
 * 
 * 문] 
 * 		5명의 학생의 세과목을 더해서 각 학생의 총점과 평균을 구하는 프로그램
 * 		또한 각 과목별 총점을 계산하여 출력하시오.
 * 		2차원 배열을 활용하여 점수를 초기화 시킨다음 진행하도록 한다.
 * 
 * 
 * 
 * 		100,100,100
 * 		20,20,20
 * 		30,30,30
 * 		40,40,40
 * 		50,50,50
 * 
 * */
public class ArrayEx04_tset {

	public static void main(String[] args) {
		int arr[][] = {
			{100,100,100}
			,{20,20,20}
			,{30,30,30}
			,{40,40,40}
			,{50,50,50}
		};
		int sumkor=0,sumEng=0,sumMat=0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("------------------------------");
		//과목별 총점을 합
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;	//각 개인별 총점
			float avg=0.0f;	//각 개인별 평균
			
			sumkor += arr[i][0];
			sumEng += arr[i][1];
			sumMat += arr[i][2];
//			System.out.printf("%3d",i+1 );
			
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
			avg=sum/(float)arr[i].length;
			//합계와 평균을 출력
			System.out.printf("합계 : %5d 평균 : %5.1f\n",sum,avg);
		}
		System.out.printf("합계: %3d %4d %4d %n",sumkor,sumEng,sumMat );
		
	}
}
	