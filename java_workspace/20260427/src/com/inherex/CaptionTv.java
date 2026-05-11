package com.inherex;

public class CaptionTv extends Tv {

	boolean caption; // 캡션 상태(on/off)
	void displayCaption(String text) {
		if(caption) { // 캡션상태가 true일 때 매개변수로 전달은 text를 출력
			System.out.println(text);
		}
	}
}
