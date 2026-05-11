package com.forextwo;

public class Study01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 0; a <= 5 ; a++) {
			for(int b = 5; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int c = 1; c < 5; c++) {
			for(int d = 0; d <= c; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
