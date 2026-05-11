package com.forextwo;

public class Study02 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j >= (j - i) ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
