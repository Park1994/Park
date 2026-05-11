package com.example;

/*
 * 문제) 이름, 도시, 나이, 체중, 독신 여부를 입력받고 출력하는 프로그램을 작성하시오.
 * 입력은 Scanner 클래스를 사용하시오.
 * 
 * String 		-> 이름, 도시 			next()
 * int 			-> 나이 					nextInt()
 * double		-> 체중 					nextDouble()
 * boolean 	-> 독신 여부 			nextBoolean()
 */

import java.util.*;
public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String name, city;
//		int age;
//		double weight;
//		boolean married;
//		
//		System.out.print("이름: ");
//		name = sc.next();
//		System.out.print("도시: ");
//		city = sc.next();
//		System.out.print("나이: ");
//		age = sc.nextInt();
//		System.out.print("체중: ");
//		weight = sc.nextDouble();
//		System.out.print("독신 여부: ");
//		married = sc.nextBoolean();
//		System.out.println();
		
//		System.out.println(name);
//		System.out.println(city);
//		System.out.println(age);
//		System.out.println(weight);
//		System.out.println(married);
		
		String name = sc.next();
		System.out.print("이름은 " + name);
		String city = sc.next();
		System.out.print("도시는 " + city);
		int age = sc.nextInt();
		System.out.print("나이는 " + age);
		double weight = sc.nextDouble();
		System.out.print("체중은 " + weight);
		boolean single = sc.nextBoolean();
		System.out.print("독신 여부는 " + single);
	}

}
