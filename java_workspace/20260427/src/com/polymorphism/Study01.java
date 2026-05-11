package com.polymorphism;

class Study02 {
	private int a;
	
	public Study02(int a) {
		this.a = a;
	}
	
	public void show() {
		System.out.println(a);
	}
}

public class Study01 {

	public static void main(String[] args) {
		
		Study02 st = new Study02(100);
		st.show();
		
	}

}
