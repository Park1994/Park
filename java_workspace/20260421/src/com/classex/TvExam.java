package com.classex;

public class TvExam {

	public static void main(String[] args) {
		// Tv 객체(인스턴스) 생성
		// 객체는 클래스로 구현할 것을 말한다.
		// 인스턴스는 객체를 실체화 시킨 것을 말한다.
		Tv t; // Tv 인스턴스를 참조하기 위한 참조변수 선언
		t = new Tv(); // Tv 인스턴스를 생성했다.
		System.out.println(t.channel);
		t.channel = 7; // Tv 인스턴스 멤버변수인 channel에 값을 대입했다.
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		
	}

}

class Tv1 {
	/*
	 * 	속성: 크기, 길이, 높이, 색상, 채널, 볼륨 -> 멤버필드(변수)
	 * 	기능: 켜기, 끄기, 볼륨 높이기, 볼륨 내리기, 채널 변경하기 -> 멤버 메소드
	 */
	// 멤버필드(멤버변수)
	String color; // 필드
	boolean power;
	int channel;
	
	// 멤버메소드(함수)
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}