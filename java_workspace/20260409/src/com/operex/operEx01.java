package com.operex;

/*
 * 조건 삼항 연산자
 * 조건식 ? 조건식이 참일 때 : 조건식이 거짓일 때
 */

public class operEx01 {

	public static void main(String[] args) {
		
		int x, y, z;
		int absX, absY, absZ;
		char singX, singY, singZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		// x의 값이 0보다 작으면 음수, 0보다 크면 양수
		/*
		if(x >= 0) {
			absX = x;
		}
		else {
			absX = -x;
		}
		*/
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		// 조건 삼항을 중첩으로 실행
		singX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
		singY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
		singZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');
		
		System.out.printf("x = %c%d%n", singX, absX);
		System.out.printf("y = %c%d%n", singY, absY);
		System.out.printf("z = %c%d%n", singZ, absZ);
	}

}
