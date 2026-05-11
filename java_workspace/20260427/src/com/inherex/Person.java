package com.inherex;

public class Person {
	
	private int weight; // 현재 클래스에서만 접근이 가능하다.
	int age; // default -> 같은 패키지 내에서 접근 가능
	protected int height; // 같은 패키지 내에서 다른 클래스
	public String name; // 패키지와 다른 패키지에서도 접근 가능
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
