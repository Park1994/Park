package com.ioex;

/*
 * 문자 하나를 입력받는 방법
 */

import java.io.*;
public class InputEx02 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 입력: ");
		char ch = (char)System.in.read();
		System.out.println("입력받은 문자: " + ch);
	}

}
