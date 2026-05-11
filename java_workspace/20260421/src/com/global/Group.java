package com.global;

import java.util.Scanner;

public class Group {
	
	private char type;
	private Seat[] seats;
	private Scanner sc;
	
	public Group(char type, int num) {
		
		this.type = type;
		seats = new Seat[num];
		for(int i = 0; i < seats.length; i++) {
			seats[i] =new Seat();
		}
		sc = new Scanner(System.in);
	}
	
	public boolean reserve() {
		show();
		int no;
		String name;
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("번호: ");
		no = sc.nextInt();
		
		// 좌석의 유효범위 (1 ~ 10)
		if(no < 1 || no >= seats.length) {
			System.out.println("존재하지 않는 좌석입니다.");
			return false;
		}
		
		// 이미 예약된 좌석이라면
		seats[no - 1].reserve(name); 
			// 예약이 성공하게 되면 true 를 반환하면 됨
		return true;
		
	}
	
	// 취소는 예약자의 이름을 입력받아 진행하되, 입력받은 이름으로 예약이 되었는지를 먼저 확인한다.
	public boolean cancel() {
		show();
		String name;
		System.out.print("이름: ");
		name = sc.next();
		
		if(name != null) { // 이름이 존재한다면
			for(int i = 0; i < seats.length; i++) {
				if(seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자의 이름을 찾을 수가 없습니다.");
		}
		
		// 예약자의 이름이 존재하지 않는 경우
		return false;
	}
	
	// 각 타입별로 시트를 출력한다.
	public void show() {
		System.out.print(type + " => ");
		for(int i = 0; i <seats.length; i++) {
			if(seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			}
			else {
				System.out.print("___");
			}
			System.out.print("  ");
		}
		System.out.println();
	}
}
