package com.arrayex;

/*
 * 	문제)	인원 수를 입력받아 인원 수만큼 학생이름, 전화번호를 입력받고
 * 			배열에 저장하여 출력하는 프로그램을 구현하시오.
 * 			
 * 			입력
 * 			학생 수: 3
 * 			이름 전번 입력(1): 가길동 010-1111-1111
 * 			이름 전번 입력(2): 가길동 010-1111-1111
 * 			이름 전번 입력(3): 가길동 010-1111-1111
 * 
 * 			출력
 * 			전체 학생 수: 3
 * 			이름 전번
 * 			가길동 010-1111-1111
 * 			가길동 010-1111-1111
 * 			가길동 010-1111-1111
 */

import java.util.*;
public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = 0;
		System.out.print("학생 수: ");
		b = sc.nextInt(); // nextInt()나 next()는 숫자는 가져가고 \n은 버퍼에 그대로 남는다.
		sc.nextLine(); // 버퍼에 남아있는 \n을 제거하기 위해 작성해야 한다.
		String[] a = new String[b];
		String[] c = new String[b];
		//	String[] name = new String(b);
		//	String[] tel = new String(b);
		for(int i = 0; i < c.length; i++) {
			System.out.print("이름    전번 입력: ");
			a[i] = sc.nextLine();
			c[i] = sc.nextLine();
		}
		System.out.println();
		System.out.println("전체 학생 수: " + b);
		for(int i = 0; i < c.length; i++) {
			System.out.println(a[i]+ "\t" + c[i]);
		}
		// for(int i = 0; i < name.length; i++) {
		//  	System.out.print("이름 전번 입력(" + ( i + 1) + ") : ");
		// 		name[i] = sc.next();
		// 		tel[i] = sc.next();
		// for(int i = 0; i < name.length; i++) {
		//		System.out.println(name[i] + " " + tel[i]);
		//	}
	}

}
