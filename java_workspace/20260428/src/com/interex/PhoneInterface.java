package com.interex;

public interface PhoneInterface {

	final int TIMEOUT = 10000; // 상수
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	
	default void printLog() { // default 메소드
		System.out.println("** Phone **");
	}
}
