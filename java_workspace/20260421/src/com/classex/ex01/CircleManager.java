package com.classex.ex01;

/*
 * 문제)	Circle 클래스와 CircleManager 클래스를 활용하여 다음과 같이 출력되도록 프로그램을 구현하시오.
 * 
 * 			x, y, radius: 3.0 3.0 5
 * 			x, y, radius: 2.5 2.7 6
 * 			x, y, radius: 5.0 2.0 4
 * 
 * 			가장 면적이 큰 원은 (2.5, 2.7) 6
 * 
 * 			(3.0, 3.0) 5
 * 			(2.5, 2.7) 6
 * 			(5.0, 2.0) 4
 */
import java.util.*;
class Circle {
	private double x;
	private double y;
	private int radius;
	
	public Circle(double x, double y, int r) { // 필드 초기화
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y +") " + radius);
	}
	
	public double getArea() {
		return Math.PI * radius;
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Circle 크기 3인 객체배열의 선언
		Circle[] a = new Circle[3];
		for(int i = 0; i < a.length; i++) {
			System.out.print("x, y, radius: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int r = sc.nextInt(); 
			// 객체를 생성
			a[i] = new Circle(x, y, r);
		}
		System.out.println();
//		// 모든 Circle 객체 출력
//		for(int i = 0; i < a.length; i++) {
//			a[i].show();
//		}
		int bigIndex = 0;
		for(int i = 1; i < a.length; i++) {
			if(a[bigIndex].getArea() < a[i].getArea()) {
				bigIndex = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		a[bigIndex].show();
	}
}
