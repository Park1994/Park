package com.exam;
/*
 * stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하여
 * 아래와 같이 결과를 출력하시오.
 * 
 * 총 스택 정장 공간의 크기 입력 : 3
 * 문자열 입력 : love
 * 문자열 입력 : happy
 * 문자열 입력 : hello
 * 문자열 입력 : love
 * 스택이 꽉차서 푸시 불가
 * 문자열 입력 : 그만
 * 스택에 저장된 문자열 팝 : hello,happy,love 
 * 
 * 문9]
 * 		interface Stack{
 * 			int length();//스택에 저장된 개수 리턴
 * 			int capacity();//스택의 전체 저장 가능한 개수 리턴
 * 			String pop();//스택의톱(top)에 실수 저장
 * 			boolean push(String val);//스택톱에 저장된 실수를 리턴
 * 		}
 * */
public interface Stack {
	int length();//스택에 저장된 개수 리턴
	int capacity();//스택의 전체 저장 가능한 개수 리턴
	String pop();//스택의톱(top)에 실수 저장
	boolean push(String val);//스택톱에 저장된 실수를 리턴
}
