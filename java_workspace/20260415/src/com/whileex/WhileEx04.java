package com.whileex;

/*
 * 	문제)	-1^2 + 2^2 - 3^2 + 4^2...............+ 100^2 까지의 합계를 구하는 프로그램을 작성하시오.
 * 			단, while문 사용
 */

public class WhileEx04 {

	public static void main(String[] args) {
		
		int a = 0;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
//		int plus = 1;
		
		while(a <= 100) {
			if(a % 2 == 0) { // 짝수
				sum1 = sum1 + (a * a);
			}
			else { // 홀수
				sum2 = sum2 - (a * a); // -수가 더해진다.
			}
//			plus = -plus;
//			sum = sum + plus * (a * a);
			sum = sum1 + sum2;
			a++;
		}
		System.out.println(sum);
	}

}
