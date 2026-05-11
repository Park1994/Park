package com.ifexam;

/*
 * 문제) 사용자로부터 임의의 알파벳 한 문자를 입력받아 입력받은 알파벳이 모음인지를 판정하는 프로그램을 구현하시오.
 * 단, 대소문자를 모두 적용하고 알파벳 이외의 문자가 입력되면 입력오류 처리하시오.
 */

//import java.io.*;
import java.util.*;
public class IfEx07 {

	public static void main(String[] args) /* throws IOException */ {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 문자 입력: ");
		char ch = sc.next().charAt(0);
//		char ch = (char)System.in.read();
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				System.out.println("입력하신 문자는 " + ch + "이며 모음입니다.");
			} else {
				System.out.println("입력하신 문자는 " + ch + "이며 모음이 아닙니다.");
			}
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}
}
