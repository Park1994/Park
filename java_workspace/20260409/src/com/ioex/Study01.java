package com.ioex;


import java.io.*;
public class Study01 {

	public static void main(String[] args) throws IOException {
		
		int n1;
		int n2;
		
		System.out.print("첫 번째 숫자 입력: ");
		n1 = System.in.read(); // ASCII 코드 값으로 -35가 기본적으로 잡혀있다. - 48 적지 않으면 아스키코드 문자로 인식
		System.in.read(); // \r 
		System.in.read(); // \n
//		System.in.skip(2);
		System.out.print("두 번째 숫자 입력: ");
		n2 = System.in.read() - '0';
		
		int n3 = n1 + n2;
		System.out.println(n3);
	}

}
