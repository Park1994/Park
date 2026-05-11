package com.collectionexam;

/*
 * 	문제)
 * 값 입력받고 -1 입력받으면 종료되고 최대값 출력
 */

import java.util.*;
public class CollectionExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 정수형을 저장할 벡터 객체 생성
		Vector<Integer> v = new Vector<Integer>();
				
			while(true) {
				System.out.print("정수 : ");
				int n = sc.nextInt();
				if(n == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				v.add(n);
			}
			if(v.size() == 0) {
				System.out.println("벡터가 비어 있습니다.");
				return;
			}
					
			System.out.print("가장 큰 수 : ");
			int max = v.get(0);// 가장 먼저 저장된 데이터를 가장 큰 수로 초기화를 한다.
			for(int i = 1; i < v.size(); i++) {
				if(max < v.get(i)) {
					max = v.get(i);
					// 벡터에 저장된 데이터를 하나씩 비교하면서 max 보다 큰 수가 있으면
					// max 값을 변경한다.
				}
			}
			System.out.println(max);		
	}

}
