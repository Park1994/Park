package com.ifexam;

/*
 * 문제) 사용자로부터 임의의 알파벳 한 문자를 입력받아 대문자가 입력받았을 경우 소문자로 변환하고,
 * 	소문자가 입력 받았을 경우 대문자로 변환하는 프로그램을 구현하시오.
 * 단, 알파벳이 아닌 경우는 "입력오류"를 출력하시오.
 */

import java.io.*;
public class IfEx08 {

	public static void main(String[] args) throws IOException {
		
		char ch;
		
		System.out.print("알파벳 한 문자 입력: ");
		ch = (char)System.in.read();
		
		if(ch >= 'A' && ch <= 'Z') { // 대문자가 입력되었을 경우
			ch = (char)(ch + 32);
			System.out.println(ch);
		} else if(ch >= 'a' && ch <= 'z') { // 소문자가 입력되었을 경우
			ch = (char)(ch - 32);
			System.out.println(ch);
		} else { // 알파벳이 아닌 경우
			System.out.println("입력오류");
		}
	}
}
