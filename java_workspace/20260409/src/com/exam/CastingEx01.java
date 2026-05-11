package com.exam;

/*
 * 형변환(캐스팅)
 * -변수나 리터럴 타입을 다른 타입(자료형)으로 변환하는 것을 의미함
 * 형변환: 변수 또는 상수의 타입을 다른 타입으로 변환
 * 형변환 방법
 * 프로모션(자동 형변환)
 * -더 큰 자료형으로 변환(자동)
 *  정보의 손실업시 자동으로 형변환 처리함
 * ex) short a, b;
 * 		  a = b = 10;
 * 		  int c = a + b;
 * 
 * 	디모션(명시적 형변환 -> 강제 형변환)
 * - 더 작은 자료형으로 만들어서 처리하기 때문에 작은 자료형을 명시해야 함
 * 	  정보의 손실을 가져옴
 *	ex) int c = 0;
 *		 short s = 10;
 *		 c = (int)(10 + 3.5f);
 *	boolean형은 형변환 불가
 *	byte -> char로 바뀐다.
 *	long -> float 자동으로 형변환된다.
 *	이유: 실수형이 정수형보다 크기 때문에
 */

public class CastingEx01 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		// d는 실수형이기 때문에 정수형보다 크다.
		// 따라서 score에 저장하려면 먼저 정수형으로
		// 형변환 시킨 후 저장하면 된다.
		
		System.out.println("score: " + score);
		System.out.println("d: " + d);
	}

}
