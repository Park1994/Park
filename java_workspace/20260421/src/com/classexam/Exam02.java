package com.classexam;

/*
 * 	반지름을 입력받아 원의 넓이와 둘레를 구하는 프로그램을 구현하시오.
 * 	필드: 반지름
 * 메소드: 입력
 */
import java.util.*;
class Circle {
	// 필드 선언
	int r;
	double PI = 3.141592; // 변수를 상수화시킴
	
	// 입력 기능
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		r = sc.nextInt();
	}
	// 넓이 계산
	double area() {
		double result;
		result = r * r * PI;
		return result;
	}
	// 둘레 계산
	double length() {
		double result;
		result = 2 * r * PI;
		return result;
	}
	// 결과 출력
	void print(double a, double l) {
		System.out.println("반지름: " + r);
		System.out.printf("넓이: %.2f%n", a);
		System.out.printf("둘레: %.2f%n", l);
	}
}

public class Exam02 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.input();
		double a = c.area();
		double l = c.length();
		c.print(a, l);
		
	}

}
