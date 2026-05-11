package com.inherex;

public class Tv { // 부모클래스

	// 멤버필드
	boolean power; // 전원상태
	int channel; // 채널
	
	void power() { power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
