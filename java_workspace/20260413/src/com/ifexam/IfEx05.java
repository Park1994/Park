package com.ifexam;

/*
 *	조건이 여러가지인 경우(3개 이상인 경우)
 *	이럴 때 
 *	if -> else if -> else
 *
 *	if(조건식1) {
 *		조건식1이 참인 경우 수행하는 문장
 *	} else if(조건식2) {
 *		조건식2가 참인 경우 수행하는 문장
 * } else if(조건식3) {
 * 		조건식3이 참인 경우 수행하는 문장
 * } else {
 * 		1, 2, 3 외의 조건
 * 		위의 조건이 만족하지 않을 경우 수행되는 문장
 * }
 * 
 * 	학점을 판정하는 프로그램
 * 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60점 미만은 F
 * 
 * 문제) 임의의 점수를 입력받아 입력받은 점수의 학점을 판정하는 프로그램을 구현하시오.
 */

import java.util.*;
public class IfEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int a = sc.nextInt();
		char grade = ' ';
		
		if(a >= 90) { // 점수가 90점 이상이면 
			grade = 'A';
		} else if(a >= 80 && a < 90) { // 점수가 80점 이상이면 -> 80 이상 90 미만이면
			grade = 'B';
		} else if(a >= 70 && a < 80) { // 점수가 70점 이상이면 -> 70 이상 80 미만이면
			grade = 'C';
		} else if(a >= 60 && a < 70) { // 점수가 60점 이상이면 -> 60 이상 70 미만이면
			grade = 'D';
		} else { // 점수가 60점 미만이면
			grade = 'F';
		}
		
		System.out.printf("당신의 학점은 %c입니다.", grade);
	}
}
