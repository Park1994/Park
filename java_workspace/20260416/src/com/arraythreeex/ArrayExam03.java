package com.arraythreeex;

/*
 * 	문제)	배열을 이용하여 369 게임에서 박수를 쳐야하는 경우 순서대로 화면에 출력하는 프로그램을 구현하시오.
 * 			범위 1 ~ 99까지
 * 
 * 			결과
 * 			3: 박수 짝
 * 			6: 박수 짝
 * 			9: 박수 짝
 * 			33: 박수 짝짝
 * 			36: 박수 짝짝
 * 			39: 박수 짝짝
 */

public class ArrayExam03 {

	public static void main(String[] args) {
		String[] str = {"박수 짝", "박수 짝짝"};
		int result = 0, num, tsn = 0;
		// tsn = 정수에 3, 6, 9 중 하나가 있는 경우 증가시키는 변수
		
		for(int i = 1; i < 100; i++) { // 1부터 99까지
			num = i;
			for(result = num % 10; num > 0; result = num % 10) {
				if(result == 3 || result == 6 || result == 9) {
					tsn++;
				}
				num = num / 10;
			}
			if(tsn > 0) { // 3 6 9 중 하나의 수가 존재하므로
				System.out.println(i + str[tsn - 1]);
			}
			tsn = 0;
		}
		
	}

}
