package com.interex;

/*
 * 	추상 클래스와 인터페이스 비교
 * 	
 * 	abstract class class명 {
 * 		모든 멤버변수들;
 * 		모든 멤버메소드들;
 * }
 * 		-단일 상속만 가능하다.
 * 		
 * 	interface interface명 {
 * 		(public static final) int x = 10; // 상수만 가능
 * 		(public abstract) void disp(); // 추상 메소드만 가능
 * }
 * 		-다중 상속이 가능하다.
 */

public class InterfaceEx02 implements Inter3 {

	int a = 100;
	
	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a + 10;
	}

	public static void main(String[] args) {
		
		InterfaceEx02 it = new InterfaceEx02();
		
		Inter1 it1 = new InterfaceEx02();
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}

}
