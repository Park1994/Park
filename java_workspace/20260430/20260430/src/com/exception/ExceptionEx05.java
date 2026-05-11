package com.exception;

public class ExceptionEx05 {

	int ss[];
	public ExceptionEx05() {
		ss = new int[3];
	}
	public void program() {
		for(int i=0;i<=ss.length;i++)
		{
			System.out.println("for문 시작"+i+"번째");	
			try {
				System.out.println(ss[i]);
			}catch (Exception e) {
//				System.out.println("Exception 발생" + e);
//				System.out.println(e.getMessage());
//				e.getMessage();
//				e.printStackTrace();
				
				/* Exception 클래스의 메세지 출력 메소드
				 * e.getMessage() : 
				 * 		- 발생한 예외 클래스의 인스턴스 메시지를 얻어서 출력
				 * e.printStackTrace() :
				 * 		- 예외 발생 당시의 호출 스택에 있었던 메소드의 정보와 에외 메시지를 화면 출력
				 * */
				
				return;
			}finally {
				System.out.println("무조건 go!");
			}
			System.out.println("for문 끝"+i+"번째");	
		}
	}
	public static void main(String[] args) {
		new ExceptionEx05().program();;
		System.out.println("프로그램 종료");
	}
}
