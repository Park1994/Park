package com.abstractex;

public class Marine extends Unit {

	public void stimpack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
	}

	@Override
	void move(int x, int y) {
		System.out.println("마린이 위치 이동 좌표는 x: " + x + ", " + "y: " + y + "입니다.");
	}

	@Override
	void stop() {
		System.out.println("마린이 대기 상태에 있습니다.");
	}

	@Override
	void message() {
		System.out.println("Message: standing back.");
	}
}
