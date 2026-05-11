package com.classex.ex01;

/*
 * 	Tv 클래스를 작성하시오.
 * 	필드(멤버변수): 제조사, 년도, 인치
 * 생성자: 초기화함
 *	메소드: 출력하는 메소드 show()
 *
 * public static void main(String[] args) {
 * 		Tv myTv = new Tv("Lg", 2026, 32); // Lg에서 2026년형 32인치
 * 		myTv.show();
 * }
 * 
 * 		결과
 * 		Lg에서 만든 2026년형 32인치 TV
 */

public class Tv {
// 필드 선언
	private String make;
	private int year;
	private int inch;
	
	public Tv(String a, int b, int c) {
		// 생성자를 활용하여 필드를 초기화함
		this.make = a;
		this.year = b;
		this.inch = c;
	}
	
	public void show() {
		System.out.println(make + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	public static void main(String[] args) {
		Tv myTv = new Tv("Lg", 2026, 32); // Lg에서 2026년형 32인치
		myTv.show();
	}

}
