package com.abstractex;

public abstract class AbsEx02 extends AbsEx01 {

	@Override
	public int getA() { // 부모 클래스인 AbsEx01 클래스의 추상 메소드를 재정의한 것
		return a;
	}

	public abstract String getStr();
}
