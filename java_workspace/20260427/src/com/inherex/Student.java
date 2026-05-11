package com.inherex;

public class Student extends Person {
	
	public void set() {
		age = 30; // 부모 클래스의 디폴트 멤버 접근 가능
		name = "가길동"; // 부모 클래스의 public 멤버 접근 가능
		height = 175; // 부모 클래스의 protected 멤버 접근 가능
//		weight = 65; // 오류발생 이유 -> 부모 클래스의 멤버필드가 private 이기 때문에 접근 불가
		setWeight(65); // private 멤버 weight은 setter 메소드로 접근하여 사용한다.
	}
	
	public void display() {
		System.out.println(name + "은 나이가 " + age + "이고 키는 " + height + 
				"이며 체중은 " + getWeight() + "kg입니다.");
	}
}
