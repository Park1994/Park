package com.gameex;
import java.util.*;
public class WordGameApp {

	// 필드 선언
	// 스캐너, 참가자 객체배열, 처음단어 초기화필드
	private Scanner sc;
	private Player[]  p;// 게임 참가자를 객체 배열로 선언
	// 시작단어 초기화
	private String startWord ="아버지";
	
  // 생성자구현(스캐너 초기화)
	public WordGameApp() {
	   sc = new Scanner(System.in);
	}
	
	
// 게임 참가자 수를 입력받고 객체 배열을 생성하는 메소드	
  public void Players() {	
	// 객체배열을 생성하였으면 
	System.out.print("게임 참가자 인원수 : ");
	int n = sc.nextInt();
	
	// 입력 받은 게임참가자 만큼 객체 배열 선언
	p = new Player[n];
	
	// 참가자의 이름 입력
	for(int i = 0; i < p.length; i++) {
	// 생성된 객체배열로 참가자 만큼 객체 생성
		System.out.print("참가자 이름 : ");
		String name = sc.next();
		p[i] = new Player(name);
	
	}
  }
	// 게임을 실행하는 메소드
	public void run() {
	  System.out.println("끝말잇기 게임을 시작합니다.");
	  // 게임 메소드 참가자 호출
	  Players();
	  // 시작 단어 출력
	  String lastWord = startWord;
	  System.out.println("시작단어는 "+lastWord+" 입니다.");
	  int num = 0;// 다음 참가자를 위해 증가시키는 변수 선언
	  while(true) {
		  // 다음 참가자가 입력한 새로운 단어를 저장할 필드
		  String newWord = p[num].getWordFromUser();
		  
		  // 참가자가 입력한 단어가 맞는지를 판단하여 게임을 계속 진행할 것인지 아니면 그만 할 것인지를 결정
		  if(!p[num].checkSuccess(lastWord)) {
			  // 다음참가자가 입력단어가 맞지 않을경우=> 게임을 중지하고 게임참가자을 이름을 출력
			  System.out.println(p[num].getName()+"이 게임에서 지셨습니다.");
			  break; // 게임을 끝냄
		  }
		  // 다음 참가자
		  num++;
		  
		  num %= p.length;
		  lastWord = newWord;
	  }
	}

	public static void main(String[] args) {
		new WordGameApp().run();
	}

}
