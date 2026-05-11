package com.ioex;

/*
 * 문자열을 입력하는 방법
 * 문자 하나 이상(문자열) 입력 받기
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 버퍼 객체 생성
 * br.readLine(); 한 줄에 입력한 문자열을 입력받는다.
 * 
 *	입력받은 문자열을 name 변수에 저장한다.
 * String name = br.readLine();
 */

import java.io.*;
public class InputEx04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		String age;
		String address;
		String tel;
		
		System.out.print("이름 입력: ");
		name = br.readLine();
		System.out.print("나이 입력: ");
		age = br.readLine();
		System.out.print("주소 입력: ");
		address = br.readLine();
		System.out.print("전화번호 입력: ");
		tel = br.readLine();
		
		System.out.println(name + "씨 ");
		System.out.println(age + "세 네요");
		System.out.println(address + "에 사시는 군요");
		System.out.println(tel + "로 전화드리겠습니다.");
	}

}
