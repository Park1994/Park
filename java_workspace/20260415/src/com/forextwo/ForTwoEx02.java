package com.forextwo;

public class ForTwoEx02 {

	public static void main(String[] args) {
		
		for(char i = 'A'; i <= 'Z'; i++) {
			for(char j = 0; j <= (i - 66); ++j) {
				System.out.print("  ");
			}
			for(char c = i; c <= 'Z' - (i - 65); ++c) {
				System.out.print(c);
			}
			System.out.println();
			
		}
		
		for(int i = 65; i <= 90; i++) {
			for(int j = 0; j <= (i - 66); ++j) {
				System.out.print("  ");
			}
			for(int c = i; c <= 90 - (i - 65); ++c) {
				System.out.print((char)c);
			}
			System.out.println();	
		}
		
		for(int i = 65; i <= 90; i++) {
			for(int j = 0; j <= (i - 66); ++j) {
				System.out.print("  ");
			}
			for(int c = i; c <= 90; ++c) {
				System.out.print((char)c);
			}
			System.out.println();
		}
	}
}

