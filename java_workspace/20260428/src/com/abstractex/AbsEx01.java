package com.abstractex;

/*
 * 	추상 클래스의 상속관계
 * 
 * -추상 클래스 간에도 상속이 가능하다.
 * 	일반 클래스들 간의 상속과 유사하지만, 추상 클래스들 간의 상속에서는 상속받은 추상 메소드는
 * 	반드시 재정의 하지 않아도 되고, 필요할 때 재정의하여 사용할 수 있다.
 * 	즉, 그냥 상속해 두었다가 언젠가 일반 클래스에 상속되어 상속 관계가 이루어 지면
 * 	그 때 재정의해서 사용해도 된다는 의미임
 */

public abstract class AbsEx01 {
	
	int a = 10; // 변수
	final String str = "abstract test"; // 상수
	
	// 일반 메소드
	public String getStr() {
		return str;
	}
	
	abstract public int getA();
}
