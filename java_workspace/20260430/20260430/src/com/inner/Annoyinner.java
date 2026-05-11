package com.inner;

/*
 *	AnnyInner(익명)내부 클래스
 *		-익명이란 → 이름이 없는 것을 의미한다. 정의된 클래스의 이름이 없다
 * 
 * 		-Event와 관련이 있다.
 * 		-InterFace 구현이 필요없다.
 * 		-일반 메소드 내부에서 정의부를 가질 수 있다.
 * 		-abstract를 상속받을 수 있다.
 * 		-반드시 final로 선언해야한다.
 * 		-implements를 사용할 때는 한개만 사용가능하다.
 * 
 * 	구조
 * 		class Outer{
 * 			Inner inner = new Inner(){
 * 			};
 * 
 * 			public void methodA(){
 * 				new Inner(){
 * 				
 * 				}
 * 			}
 * 		}
 * 
 * */

abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
}

public class Annoyinner {

	TestAbst inn = new TestAbst() {
		
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
	
	public static void main(String[] args) {
		Annoyinner ai = new Annoyinner();
		ai.inn.printData();
	}

}
