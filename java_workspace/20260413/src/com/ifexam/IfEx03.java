package com.ifexam;

/*
 * if문에 else 블럭을 추가
 * else:  그 밖의 다른 (그 외)
 * 조건의 결과가 참이 아닌 경우 즉, 
 * 조건이 거짓일 때 else 문장을 수행하라.
 * 
 * if(조건식) {
 * 		조건이 참일 때 수행되는 문장
 * } else {
 * 		조건이 거짓일 때 수행되는 문장
 * }
 */

import java.util.*;
public class IfEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("0입니다.");
		} else { // input이 0이 아닐 때
			System.out.println("0이 아닙니다.");
		}
	}

}
