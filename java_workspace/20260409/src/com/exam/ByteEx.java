package com.exam;

/*
 *	byte: 1byte 자료형
 *	입출력 범위: -128 ~ +127
 *	전역변수는 값을 따로 초기화 하지 않도록 0 값으로 자동으로 초기화 되지만
 *	지역변수는 값을 따로 초기화 해주지 않으면 쓰레기 값이 들어가 에러가 난다.
 */

public class ByteEx {
	
	static int cc; // 클래스 변수(공유변수): 초기화를 하지 않아도 됨, 객체를 생성하지 않아도 접근이 가능한 변수
	int aa; // 인스턴스 변수(전역변수): 객체를 생성해야만 접근이 가능한 변수
	
//	public void ccc() {
//		System.out.println("나는 너를 사랑해");
//	}
	
	public static void ccc() {
		System.out.println("나는 너를 사랑해");
	}
	
	public static void main(String[] args) {
		ByteEx b = new ByteEx(); // 객체 생성: new 연산자와 생성자와 같이 결합되어 객체를 생성한다.
		byte bb = 127;
		bb++; // bb = bb + 1
		
		System.out.println("byte: " + bb);
		System.out.println(b.aa);
		// b.ccc(); // static이 안붙으면 객체 붙여야함
		ccc();
	}

}
