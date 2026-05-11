package com.example;

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(0, 0);
		if(x < 0 || y < 0) { // 만일 x 또는 y가 음수이면
			super.move(0, 0); // 원점으로 이동한다.
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if(x > 0 && y > 0) { // x, y 값이 크면 양수 이므로 이동
			super.move(x, y); // 이동
		}
		else {
			return; // 만약 작으면 점은 이동하지 않고 그대로 리턴한다.
		}
	}

	@Override
	public String toString() {
		String str = "(" + getX() + ", " + getY() + ") 의 점";
		return str;
	}

	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10); // 10, 10
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // -5, 5
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, 10);
		System.out.println(p2.toString() + "입니다.");

		
	}

}
