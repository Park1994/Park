package com.ifexam;

/*
 * 알파벳 한 문자를 입력받으면 모음인지 자음인지 판별하고 대문자로 입력받으면 소문자로, 소문자로 입력받으면 대문자로 변환
 */

import java.util.*;
public class Study04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력해주세요. : ");
		char alpha = sc.next().charAt(0);
		
		if((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
			if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
				System.out.println("모음입니다.");
				alpha = (char)(alpha - 32);
				System.out.println(alpha);
			} else if(alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
				System.out.println("모음입니다.");
				alpha = (char)(alpha + 32);
				System.out.println(alpha);
			} else {
				System.out.println("자음입니다.");
			}
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}

}
