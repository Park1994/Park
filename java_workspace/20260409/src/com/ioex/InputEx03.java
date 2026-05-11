package com.ioex;

/*
 * 숫자 하나를 입력받는 방법
 * System.in.read() - 48;
 * System.in.read() - '0';
 */

import java.io.*;
public class InputEx03 {

	public static void main(String[] args) throws IOException {
		
		int n1;
		int n2;
		
		System.out.print("첫 번째 숫자 입력: ");
		n1 = System.in.read() - 48; // ASCII 코드 값으로 -35가 기본적으로 잡혀있다.
		System.in.read(); // \r ASCII 코드 13
		System.in.read(); // \n
//		System.in.skip(2);
		System.out.print("두 번째 숫자 입력: ");
		n2 = System.in.read() - '0';
		
		int n3 = n1 + n2;
		System.out.println(n3);
	}

}
