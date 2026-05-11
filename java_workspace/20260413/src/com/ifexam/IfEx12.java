package com.ifexam;

/*
 * 문제) 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력하시오.
 * 		단, 4학년인 경우 70점 이상이어야 합격할 수 있다.
 * 		점수의 범위: 0~100, 학년: 1~4학년
 */

import java.util.*;
public class IfEx12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		System.out.print("학년을 입력세요: ");
		int year = sc.nextInt();
		
		if(score >= 60) { // 점수가 60점 이상
			if(year != 4) { // 4학년이 아니면
				System.out.println("합격");
				} else if(score >= 70) { // 학년이 4학년이면서 점수가 70점 이상
					System.out.println("합격");
				} else { // 4학년이면서 점수가 70점 이하이면 불합격
					System.out.println("불합격");
				}
		} else {
			System.out.println("불합격");
		}
	}
}