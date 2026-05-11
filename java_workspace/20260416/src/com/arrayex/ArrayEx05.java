package com.arrayex;

/*
 * 	문제)	char 자료형의 배열에 알파벳 대문자를 저장하고
 * 			저장된 배열의 전체 값을 출력하는 프로그램을 구현하시오.
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		
		/*
		 * 	알파벳 대문자를 배열에 저장
		 */
		
		char[] a = new char[26];
		a[0] = 'A';
		a[1] = 'B';
		a[2] = 'C';
		a[3] = 'D';
		a[4] = 'E';
		a[5] = 'F';
		a[6] = 'G';
		a[7] = 'H';
		a[8] = 'I';
		a[9] = 'J';
		a[10] = 'K';
		a[11] = 'L';
		a[12] = 'M';
		a[13] = 'N';
		a[14] = 'O';
		a[15] = 'P';
		a[16] = 'Q';
		a[17] = 'R';
		a[18] = 'S';
		a[19] = 'T';
		a[20] = 'U';
		a[21] = 'V';
		a[22] = 'W';
		a[23] = 'X';
		a[24] = 'Y';
		a[25] = 'Z';
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		char[] c = new char[26];
		for(int i = 0; i < c.length; i++) {
			c[i] = (char)('A' + i); // 배열에 저장
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " "); // 배열에 저장된 값 출력
		}
		System.out.println();
	}

}
