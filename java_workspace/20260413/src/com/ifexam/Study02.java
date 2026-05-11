package com.ifexam;

/*
 * 학점만들기 
 */

import java.util.*;
public class Study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		char grade, oper =' ';
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 96) {
				oper = '+';
			} else if(score < 96) {
				oper = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 86) {
				oper = '+';
			} else if(score < 86) {
				oper = '-';
			} 
		}  else if(score >= 70) {
			grade = 'C';
			if(score >= 76) {
				oper = '+';
			} else if(score < 76) {
				oper = '-';
			} 
		}  else if(score >= 60) {
			grade = 'D';
			if(score >= 66) {
				oper = '+';
			} else if(score < 66) {
				oper = '-';
			} 
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + oper + "입니다.");
	}

}
