package com.exam;

import java.util.*;                                                                          

// 게임 참가자를 의미하는 클래스
// 이름, 단어, 스캐너 필드 선언
// 생성자를 이용하여 초기값
class Player {
	private Scanner sc;
	private String name;
	private String word;
	
	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}
	
	// 사용자로부터 단어를 입력받는 메소드 정의
	public String getWordFromUser() {
		System.out.println(name + ": ");
		word = sc.next();
		return word;
	}
	
	// 마지막 단어와 참가자가 입력한 단어를 비교하여 끝말잇기가 됐는지를
	// 판정하고 맞으면 true, 틀리면 false를 반환하는 메소드
	public boolean checkSuccess(String lastword) {
		// 입력받은 단에 마지막 문자 추출
		int lastIndex = lastword.length() - 1;
		
		// 마지막 단어와 단어의 첫 문자가 같은지를 비교 판단함
		// 마지막 단어의 맨 마지막 문자와 다음 참가자가 입력한 단어의 첫 문자가 같은지를 비교 판단함
		if(lastword.charAt(lastIndex)  == word.charAt(0)) {
			// 마지막 문자와 첫 문자가 같으면 
			return true;
		}
		else {
			return false;
		}
	}
}

public class WordApp {

	// 필드 선언
	// 스캐너, 참가자 객체배열, 처음 단어 초기화 필드
	private Scanner sc;
	private Player[] p;
	
	public WordApp() {
		sc = new Scanner(System.in);
	}
	
	public void Players() {
		System.out.print("게임 참가자 인원 수: ");
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
