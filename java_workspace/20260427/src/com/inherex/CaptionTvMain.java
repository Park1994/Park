package com.inherex;

public class CaptionTvMain {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 부모클래스의 멤버필드
		ctv.channelUp(); // 부모클래스의 멤버메소드
		System.out.println(ctv.channel);
		ctv.displayCaption("사랑합니다. 여러분!!!");
		ctv.caption = true;
		ctv.displayCaption("사랑합니다. 여러분!!!");
	}

}
