package com.atm;

public class Account { // 계좌
	
	// 소유주(계좌주)
	private String name;
	// 잔액(금액)
	private long balance;
	
	public Account() { // 기본 생성자
		
	}
	
	public Account(String name) { // 생성자 오버로딩
		this.name = name;
	}
	// 현재 객체가 가지고 있는 멤버필드에 접근하려면
	// 메소드를 통해서만이 접근이 가능하다.
	
	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	
	// 입금 처리 메소드 정의
	public void deposit(long amount) {
		balance += amount;
	}
	
	// 출금 처리 메소드 정의
	public void withdraw(long amount) {
		if(balance < amount) {
			// 출금하고자 하는 금액이 현재 잔고의 잔액보다 작은 경우
			System.out.println("현재 계좌의 잔액이 부족하여 출금이 불가합니다.");
		}
		else {
			// 출금하고자 하는 금액보다 계좌에 잔액이 많은 경우는 출금이 가능하다.
			balance -= amount;
		}
	}
}
