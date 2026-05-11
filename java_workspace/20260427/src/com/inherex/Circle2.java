package com.inherex;

public class Circle2 extends SuperTest2 {
	
	public Circle2(String title) {
		super(title);
	}
	
	public void calc(int r) {
		area = r * r * 3.14;
		write();
	}
}
