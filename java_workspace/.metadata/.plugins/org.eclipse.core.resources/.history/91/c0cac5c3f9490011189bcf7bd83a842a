package com.test;

import java.util.ArrayList;

public class MyStack<T> implements IStack<T>{

	ArrayList<T> I =null;
	
	public MyStack() {
		I = new ArrayList<T>();
	}
	
	@Override
	public T pop() {
		if(I.size() == 0)
			return null;
		else
			return I.remove(0);
	}

	@Override
	public boolean push(T ob) {
		I.add(0,ob);
		return true;
	}

	
}
