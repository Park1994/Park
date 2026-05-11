package com.abstractex;

public class SeigeTank extends Unit {

	public void changeMode() {
		System.out.println("Yes sir !!");
	}

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SeigeTank => x: " + x + ", y: " + y);
	}

	@Override
	void stop() {
		System.out.println("Destinations???");
	}

	@Override
	void message() {
		System.out.println("Message: Go, SeigeTank");
	}
}
