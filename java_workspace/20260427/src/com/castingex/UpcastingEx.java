package com.castingex;

/*
 * 	업캐스팅(upcasting)
 * 		-서브 객체의 객체에 참조변수를 슈퍼 클래스의 객체 타입으로 변환하는 것을 의미함
 * 		업캐스팅은 부모 클래스의 참조변수로 서브 클래스의 객체를 가리킨다.
 */

public class UpcastingEx {

	public static void main(String[] args) {

		Person p; // 참조변수
//		Person p = new Person("나길동");
		Student s = new Student("가길동"); // 객체
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		
//		p.grade = "A";
//		p.department = "Computer";
		// p 객체를 통해서는 name, id만이 접근 가능
		
	}

}
