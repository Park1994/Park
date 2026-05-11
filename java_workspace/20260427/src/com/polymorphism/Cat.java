package com.polymorphism;

public class Cat extends Animal {

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return "야옹";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
