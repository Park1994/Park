package com.example;

/* 
 *	문제) 숫자 하나를 입력받아 그 수가 1이면 "남성", 2이면 "여성" 이라는 글자를 출력하는 프로그램을 작성하시오.
 *	단, 입력은 IO를 활용하시오.
 *	남성과 여성 판별 시 조건 삼항 연산자를 활용하시오.
 */

import java.io.*;
public class Exam03 {

	public static void main(String[] args) throws IOException {
		
//		int n1;
//		String n2;
//		
//		System.out.print("숫자 입력 (남자면 1, 여자면 2): ");
//		n1 = System.in.read() - 48;
//		System.in.skip(2);
//		
//		n2 = (n1 == 1 ? "남성" : "여성");
////		System.out.printf("%s%n", n2);
//		System.out.println(n2);
		
		System.out.print("숫자 입력 (남자면 1, 여자면 2): ");
		int n1 = System.in.read() - 48;
		System.in.skip(2);
		
		String n2 = (n1 == 1 ? "남성" : "여성");
		System.out.printf("%s%n", n2);
		
		
		
	}

}
