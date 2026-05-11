package com.classex.ex01;

/*
 * 	문제)	이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고,
 * 			실행 클래스인 PhoneBook 클래스를 구현하시오.
 * 			PhoneBook -> read(): 입력저장, search(): 전화번호 검색, run(): 실행 메소드
 * 
 * 			실행 결과
 * 			인원 수: 3
 * 			이름과 전화번호 입력: 가길동 010-1111-2222
 * 			이름과 전화번호 입력: 가길동 010-1111-2222
 * 			이름과 전화번호 입력: 가길동 010-1111-2222
 * 			저장이 되었습니다.
 * 			검색할 이름: 홍길동
 * 			홍길동이 없습니다.
 * 			검색할 이름: 가길동
 * 			가길동의 전화번호는 010-1111-2222
 * 			검색할 이름: 그만 -> 프로그램을 종료합니다. 를 출력하고 끝낸다.
 * 
 * 			hint: 객체배열을 활용, 문자열을 비교할 때 equals() 메소드로 비교한다.
 */

import java.util.*;
class Phone {
	private String name;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class PhoneBook {
	private Scanner sc; // 전역변수(인스턴스 변수)
	private Phone[] pArray; // Phone 객체배열 선언
	
	public PhoneBook() {
		// 생성자를 활용해서 스캐너를 생성한다.
		sc = new Scanner(System.in);
	}
	
	// 정보입력 및 저장하는 기능을 가진 메소드
	public void read() {
		// 인원 수 입력
		System.out.print("인원 수: ");
		int n = sc.nextInt();
		// 인수 만큼 객체배열 크기를 설정
		pArray = new Phone[n];
		
		// 인원 수만큼 이름과 전화번호를 입력받아 저장한다.
		for(int i = 0; i < pArray.length; i++) {
			// 이름 입력
			System.out.print("이름: ");
			String name = sc.next();
			// 전화번호 입력
			System.out.print("전화번호: ");
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장 되었습니다.");
	}
	
	// 이름으로 검색하여 정보를 추출한다.
	public String search(String name) {
		
		// 이름과 전화번호가 저장되어 있는 Phone 클래스에서 검색
		for(int i = 0; i < pArray.length; i++) {
			if(pArray[i].getName().equals(name)) {
				// 입력한 이름이 Phone 배열에 존재한다면
				return pArray[i].getTel(); // 전화번호를 반환한다.
			}
		}
		return null; // 이름에 해당하는 정보가 null을 반환함
	}
	
	public void run() {
		// Phone 클래스에 저장된 정보를 읽어와서 
		read();
		while(true) {
			System.out.print("검색할 이름: ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			String tel = search(name); // 내가 검색하고자 하는 이름이 전화번호에 있으면 Phone 클래스에 존재하는
			// 전화번호를 리턴받는다.
			if(tel == null) {
				System.out.println(name + "이 없습니다.");
			}
			else {
				System.out.println(name + "의 전화번호는 " + tel + "입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
//		PhoneBook pb = new PhoneBook();
//		pb.run();
		new PhoneBook().run();
	}
}
