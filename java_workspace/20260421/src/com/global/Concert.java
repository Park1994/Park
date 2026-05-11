package com.global;

import java.util.*;
public class Concert {
	
	// 콘서트 이름, 그룹 객체배열, 스캐너를 멤버필드로 선언
	private String hallName;
	private Group[] group = new Group[3];
	private Scanner sc;
	
	public  Concert(String hallName) {
		this.hallName = hallName;
		// Group 객체배열을 객체 생성
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
		sc = new Scanner(System.in);
	}
	
	// 콘서트 예약
	// 좌석타입으로 예약
	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3): ");
		int type = sc.nextInt();
		
		if(type < 1 || type > 3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return;
		}
		// 예약
		group[type - 1].reserve();
	}
	
	// 모든 좌석을 조회한다.
	public void search() {
		for(int i = 0; i < group.length; i++) {
			group[i].show();
		}
		System.out.println("조회를 완료하였습니다.");
	}
	
	// 예약취소
	// 예약취소는 좌석으로 구분
	public void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3): ");
		int type = sc.nextInt();
		
		if(type < 1 || type > 3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return;
		}
		// 예약 취소 성공
		group[type - 1].cancel();
	}
	
	// 예약 프로그램을 실행하는 메소드
	public void run() {
		System.out.println(hallName + " 예약 프로그램입니다.");
		int menu = 0;
		while(menu != 4) {
			System.out.print("1. 예약, 2. 조회, 3. 취소, 4. 종료 -> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				finish();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	// 예약 프로그램을 종료하는 메소드
	public void finish() {
		System.out.println("글로벌인 콘서트 예약 프로그램을 종료합니다.");
		System.exit(0);
	}
}
