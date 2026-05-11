package com.forextwo;

public class ForTwoEx01 {

	public static void main(String[] args) { // 중첩 for문을 의
		
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//			j
//			0	1	2	3	4
//	i	0
//		1
//		2
//		3
//		4
//		역순 j - i		
		
		for(int i = 0; i < 5; i++) { // 행
			for(int j = 0; j <= i; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i = 0; i < 5; i++) { // 행
			for(int j = 5; j <= i; j--) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
