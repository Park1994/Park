package com.example;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {
		this(0, 0); // (0, 0) 으로 초기화
		this.color = "BLACK";
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String str = color + "색의 (" + getX() + ", " + getY() + ")의 점"; 
		// private 변수를 불러오려면 protected로 바꾸거나 메소드로 불러와야 한다.
		return str;
	}
	
	public static void main(String[] args) {

		ColorPoint zeroPoint = new ColorPoint(); // (0, 0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str+"입니다");
		System.out.println(cp.toString() + "입니다");

	}

}
