package com.ifexam;

/*
 * 1~4학년 중에서 1~3학년은 60점 이상이면 합격 4학년은 70점이상이어야 합격 프로그램 작성
 */

import java.util.*;
public class Study05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력하세요. : ");
		int grade = sc.nextInt();
		if(grade > 4) {
			System.out.println("학년을 다시 입력해주세요.");
			return;
		}	
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		
		
		if(0 < grade && grade < 4) {
			if(60 <= score && score <= 100) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else if(grade == 4) {
			if(70 <= score && score <= 100) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
	}
}

