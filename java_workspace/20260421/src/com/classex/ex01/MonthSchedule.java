package com.classex.ex01;

import javax.swing.text.View;

/*
 * 	문제)	MonthSchedule 클래스에 Day 객체배열과 적절한 필드, 메소드를 작성하고,
 * 			실행결과와 같이 3가지 기능을 가진 프로그램을 작성하시오.
 * 
 * 			MonthSchedule 클래스에는 생성자, input(), view(), finish(), run() 메소드를 만들고
 * 			main() 메소드에서 실행하여 메뉴를 출력하도록 처리한다.
 * 
 * 			실행 결과
 * 			이번달 스케줄 관리 프로그램
 *			할 일(입력: 1, 보기: 2, 종료: 3): 1
 *			날짜(1 ~ 30): 1
 *			할 일(빈 칸없이 입력): 자바공부
 *			 
 *			할 일(입력: 1, 보기: 2, 종료: 3): 2
 *			날짜(1 ~ 30): 1
 *			1일의 할 일은 자바공부입니다.
 *
 * 			할 일(입력: 1, 보기: 2, 종료: 3): 3
 *			프로그램을 종료합니다.
 */
import java.util.*;
public class MonthSchedule {
	// 필드 선언
	// 날짜 필드
	private int nDays; // 한 달의 날짜
	// Day 객체배열 선언
	private Day[] days;
	// 입력은 스캐너로 한다.
	private Scanner sc;
	
	// 생성자에서 날짜, 배열의 크기, 스캐너 객체 생성
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		// 객체배열을 공간 할당
		this.days = new Day[nDays];
		for(int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜(1 ~ 30): ");
		int day = sc.nextInt();
		System.out.print("할 일(빈 칸없이 입력): ");
		String work = sc.next();
		day--;
		if(day < 0 || day > nDays) { // 0 ~ 29까지의 유효 범위에 있는지
			System.out.println("날짜를 잘못 입력하셨습니다. 다시 입력해 주세요.");
			return;
		}
		days[day].setWork(work);
	}
	
	public void view() {
		System.out.print("날짜(1 ~ 30): ");
		int day = sc.nextInt();
		day--; // 인덱스는 0번부터 시작하기 때문에 1을 빼줘야 한다.
		if(day < 0 || day > nDays) { // 0 ~ 29까지의 유효 범위에 있는지
			System.out.println("날짜를 잘못 입력하셨습니다. 다시 입력해 주세요.");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은 "); // 1을 뺐기 때문에 출력할 때는 1을 더해줘야 한다.
		days[day].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램");
		while(true) {
			System.out.print("할 일(입력: 1, 보기: 2, 종료: 3): ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월 한 달을 기준으로 한다.
		april.run();
		
	}

}
