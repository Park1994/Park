package com.ifexam;

/*
 *	알파벳 한 문자 입력받아 모음인지 아닌지 출력 
 */

import java.util.*;
public class Study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자 입력하세요. : ");
		char alpha = (char)sc.next().charAt(0);
		
		if((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
			if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
				System.out.println("모음입니다.");
			} else if(alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
				System.out.println("모음입니다.");
			} else {
				System.out.println("자음입니다.");
			}
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}

}
