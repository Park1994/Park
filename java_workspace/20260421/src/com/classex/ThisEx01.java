package com.classex;

/*
 * 	this 와 this() 의 차이
 * 		-this란 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수를 의미한다.
 * 		-객체의 주소는 객체가 생성되기 전까지는 아무도 모르기 때문에
 * 			객체 생성 후에 자신의 주소로 대치됨
 * 
 * 		-this()는 현재 객체의 생성자를 의미함
 * 		-생성자 안에서 다른 생성자를 호출할 경우 this()라고 하여 호출함
 */

class ThisEx {
	private String name;
	private String jumin;
	private String tel;
	
	public ThisEx() { // 기본 생성자
		this.name = "홍길동";
		this.jumin = "000000-0000000";
		this.tel = "010-1111-2222";
	}
	
	public ThisEx(String name) { // 생성자의 오버로딩
		// 생성자에서 다른 생성자를 호출할 경우
		// 첫번째 라인에 기입을 함
		this(); // 다른 생성자 호출 -> 첫번째 라인에 기입해야함
		this.name = name;
	}
	
	public ThisEx(String name, String jumin) {
		this(name); // 다른 생성자를 호출 -> 매개변수가 하나인 생성자를 호출
		this.jumin = jumin;
	}
	
	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJumin() {
		return jumin;
	}
	
	public String getTel() {
		return tel;
	}
}
public class ThisEx01 {

	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		System.out.println("Name: " + t.getName());
		System.out.println("Jumin: " + t.getJumin());
		System.out.println("Tel: " + t.getTel());
	}

}
