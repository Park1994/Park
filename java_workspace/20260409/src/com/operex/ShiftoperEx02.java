package com.operex;

public class ShiftoperEx02 {

	public static void main(String[] args) {
		
		int d = 1234;
		int h = 0XABCD;
		int m = 0XF;
		
		System.out.printf("hex = %X%n", h);
		System.out.printf("%X%n", h & m);
		System.out.printf("%#X & %#X = %#X \t %s%n", h, m, h & m, toBinaryString(h & m));
		System.out.println();
		System.out.printf("%X%n", h & m);
		h = h >> 4;
		System.out.printf("%X%n", h & m);
		h = h >> 4;
		System.out.printf("%X%n", h & m);
		h = h >> 4;
		System.out.printf("%X%n", h & m);
		h = h >> 4;
		System.out.printf("%X%n", h & m);
	}
	
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String temp = zero + Integer.toBinaryString(x);
		return temp.substring(temp.length() - 32);
	}
}
