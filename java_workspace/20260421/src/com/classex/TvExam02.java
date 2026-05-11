package com.classex;

public class TvExam02 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		// 객체 생성(인스턴스 생성)
		Tv t2 = new Tv();
		
		System.out.println("t1 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2 channel의 값은 " + t2.channel + "입니다.");
		System.out.println();
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1 channel의 값은 " + t1.channel + "입니다.");
		System.out.println();
		System.out.println("t1 channel의 값은 " + t1.channel + "입니다.");
		System.out.println("t2 channel의 값은 " + t2.channel + "입니다.");
	}

}
