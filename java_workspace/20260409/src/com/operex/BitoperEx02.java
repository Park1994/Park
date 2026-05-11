package com.operex;

/*
 * 비트 부정연산(~): 0은 1로, 1은 0으로 바꾼다. (논리 부정연산의 !와 같다.)
 */

public class BitoperEx02 {

	public static void main(String[] args) {
		
		byte p = 10;
		byte n = -10;
		
		System.out.printf("p = %d \t\t%s%n", p, toBinaryString(p));
		System.out.printf("~p = %d \t\t%s%n", ~p, toBinaryString(~p));
		// 비트 부정은 먼저 1을 더하고 +면 -로, -면 +로 바꾼다.
		System.out.printf("~p + 1 = %d \t%s%n", ~p + 1, toBinaryString(~p + 1));
		System.out.printf("~~p = %d \t\t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		System.out.printf("n = %d \t\t%s%n", n, toBinaryString(n));
		System.out.printf("~n = %d \t\t%s%n", ~n, toBinaryString(~n));
		System.out.printf("~(n - 1) = %d \t%s%n", ~(n - 1), toBinaryString(~(n - 1)));
	}
	
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String temp = zero + Integer.toBinaryString(x);
		return temp.substring(temp.length() - 32);
	}
}
