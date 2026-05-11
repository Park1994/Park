package com.exam;

/*
 * Wrapper Class: 기본 데이터 자료형을 객체(Class)화
 * 기본 자료형 -> 객체화시킨 자료형
 * byte -> Byte
 * short -> Short
 * int -> Integer	
 * long -> Long
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 * char -> Character
 */

public class WrapperEx {

	public static void main(String[] args) {
		
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		
		char b_min = Character.MIN_VALUE;
		char b_max = Character.MAX_VALUE;
		
		float c_min = Float.MIN_VALUE;
		float c_max = Float.MAX_VALUE;
		
		System.out.println("byte: " + a_min + " ~ " + a_max);
		System.out.println("char: " + (int)b_min + " ~ " + (int)b_max);
		System.out.println("float: " + c_min + " ~ " + c_max);
	}

}
