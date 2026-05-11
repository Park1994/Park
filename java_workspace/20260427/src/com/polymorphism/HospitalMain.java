package com.polymorphism;

public class HospitalMain {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		// 부모 타입을 참조변수를 활용하여 자식 객체를 생성함
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
	}

}
