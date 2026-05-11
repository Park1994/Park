package com.classexam;

/*
 * 	더하기, 빼기, 곱하기, 나누기 기능을 가지고 있는 클래스를 설계
 * 필드: 정수 두 개
 * 기능: 더하기, 빼기, 곱하기, 나누기 기능
 * 클래스명: Calc
 * 필드명: a, b
 * 	메소드명:	 add(), sub(), com(), div()
 */

import java.util.*;
class Calc {
	
	int add(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
	
	int sub(int a, int b) {
		int c;
		c = a - b;
		return c;
	}
	
	int com(int a, int b) {
		int c;
		c = a * b;
		return c;
	}
	
	int div(int a, int b) {
		int c;
		c = a / b;
		return c;
	}
	
	void print(int d, int e, int f, int g) {
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("첫번째 정수: ");
		a = sc.nextInt();
		System.out.print("두번째 정수: ");
		b = sc.nextInt();
		
		int d, e, f, g;
		Calc i = new Calc();
		d = i.add(a, b);
		e = i.sub(a, b);
		f = i.com(a, b);
		g = i.div(a, b);
		
		i.print(d, e, f, g);
	}

}
