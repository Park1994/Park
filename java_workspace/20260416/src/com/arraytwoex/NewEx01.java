package com.arraytwoex;

import java.io.*;
public class NewEx01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print("입력: ");
		a = System.in.read(); // 문자로 입력받기
		System.in.skip(2);
		System.out.print("입력: ");
		b = System.in.read() - 48; // 숫자로 입력받기
		
		c = a + b;
		System.out.println((char)c);
	}

}
