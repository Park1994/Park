package com.classex.ex01;

/*
 * 	한글과 영어를 저장한 배열, 한글 단어를 매개변수로 전달받아 검색하는 메소드
 */

public class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		// 검색 작성
		// 한글 단어를 입력받아 이에 대응하는 영어단어를 검색하는 메소드를 구현
		// 한글단어에 대응하는 영어단어가 존재한다면 영어단어를 반환한다.
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		
		return null; // 한글에 대응하는 영어 단어가 존재하지 않는다면 null을 반환
	}
}
