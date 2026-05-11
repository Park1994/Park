package com.interex;

public class SamsungPhone extends PDA implements MobilePhone, MP3Interface {

	@Override
	public void sendCall() {
		
		System.out.println("띠리리리링~~~~~");
	}

	@Override
	public void receiveCall() {

		System.out.println("주인님 전화왔습니다.");
	}

//	// 메소드 추가
//	public void flash() {
//		System.out.println("전화기 불이 켜졌습니다.");
//	}
	
	@Override
	public void play() {

		System.out.println("음악을 재생합니다.");
	}
	
	@Override
	public void stop() {

		System.out.println("음악을 종료합니다.");
	}
	
	@Override
	public void sendSMS() {

		System.out.println("문자를 보냅니다.");
	}
	
	@Override
	public void receiveSMS() {

		System.out.println("문자를 받습니다.");
	}
	
	public void schedule() {
		System.out.println("일정관리 합니다.");
	}
	
}
