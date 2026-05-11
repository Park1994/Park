package com.classex.ex01;

/*
 * 	문제)	여러 개의 클래스를 활용하여 프로그램을 구현하시오.
 * 			더하기, 빼기, 곱하기, 나누기를 수행하는 각 클래스의 이름을 만드시오.
 * 			클래스 -> Add, Sub, Mul, Div
 * 
 * 			각 클래스마다 구성되는 필드와 메소드는 동일하다.
 * 			int 타입(자료형)의 a, b 필드 -> 피연산자(첫번째 수, 두번째 수)
 * 			void setValue(int a, int b) 피연산의 값을 객체에 저장한다.
 * 			int calculate(): 클래스 내에서 연산을 수행하고 결과를 리턴해주는 메소드
 * 
 * 			main() 메소드를 가지고 있는 실행 클래스인 Calc 클래스에서
 * 			두 정수와 연산자를 입력받아 Add, Sub, Mul, Div 중에서
 * 			이 연산을 실행할 수 있는 객체를 생성하고,
 * 			메소드(setValue, calculate)를 호출하여 결과를 출력하는 프로그램을 구현한다.
 * 
 * 			출력 결과
 * 			두 정수와 연산자 입력: 5 7 *
 * 			35
 */
import java.util.*;
class Add2 {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a + b;
	}
}

class Sub2 {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a - b;
	}
}

class Mul2 {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a * b;
	}
}

class Div2 {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a / b;
	}
}

public class Calc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char op;
		System.out.print("두 정수와 연산자 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			Add2 add = new Add2();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub2 sub = new Sub2();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul2 mul = new Mul2();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div2 div = new Div2();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}

}
