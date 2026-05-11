package com.whileex;

/*
 * 	임의의 정수를 입력받아 입력받은 다음 그 수만큼 3배수를 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int i = 1;
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
//		while(i <= a) {
//			System.out.println(i * 3 + "\t");
//			i++;
//		}
		
		do {
			System.out.print(i * 3 + "\t");
			i++;
		} while(i <= a);
	}

}
