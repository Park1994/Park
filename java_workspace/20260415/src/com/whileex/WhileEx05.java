package com.whileex;

/*
 * 	문제)	-50에서부터 1까지 수를 출력하는 프로그램을 구현하시오.
 * 			단, 한 줄에 5개씩만 출력하고, 수 들 사이에 간격은 탭 간격으로 정하시오.
 * 			-50	-49	-48	-47	-46
 * 			-45	-44	-43	-42	-41
 */

public class WhileEx05 {

	public static void main(String[] args) {
		
		int a = -50;
		
		while(a <= 1) {
				System.out.printf("%2d \t", a);
				a++;
				if(a % 5 == 0) {
					System.out.println();
				}
		}
	}

}
