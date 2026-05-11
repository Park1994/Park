package com.forextwo;

public class Study03 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int z = 0; z <= 10 - i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10 - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 10; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
