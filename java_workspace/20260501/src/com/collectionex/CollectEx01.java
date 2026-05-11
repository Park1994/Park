package com.collectionex;

/*
 * 	자료
 * 	-현실 세계로부터 단순한 관측이나 측정을 통해 수집된 사실이나 개념의 값들 또는 그 값들의 집합
 * 
 * 	자료구조
 * 	-자료 처리를 위한 자료의 표현, 저장, 관계, 관리 및 이용에 관한 방법 등의 개념을 이해하여
 * 	프로그램에 사용하고 컴퓨터에 의해 처리될 때, 적절한 자료의 표현, 구성, 저장 및 처리를 위한
 * 	알고리즘의 작성 및 선택과 이용방법을 의미함
 * 
 * 컬렉션 프레임워크
 * 		컬렉션의 표현과 조작을 위한 통일된 아키텍쳐로 컬렉션 프레임워크를 구성 세 가지 요소
 * 
 * 		1. 인터페이스(interface)
 * 			-컬렉션에 필요한 데이터 관리 기능을 제공함
 * 			list는 추가, 삭제, 검색 등의 기능을 제공
 * 			각 컬렉션마다 고유의 인터페이스 정의
 * 
 * 		2. 구현(implements)
 * 			-인터페이스를 구현한 클래스고 각 컬렉션을 실제 어떤 자료구조를 이용하여 표현
 * 			했느냐에 따라 컬렉션의 종류가 달라짐
 * 
 * 		3. 알고리즘(algorithms)
 * 			-각 컬렉션마다 유용하게 사용할 수 있는 메소드(기능)을 의미함
 * 
 * 		자바의 컬렉션은 견고한 컬렉션 프레임워크 기반 위에 정의되어 있으므로
 * 		각 컬렉션 종류마다 제공되는 메소드는 일관성을 가지고 있다.
 * 		한 가지 컬렉션을 익혀두면 다른 컬렉션을 사용하는데 용이하다.
 */

import java.util.*;
public class CollectEx01 {

	public static void main(String[] args) {

		// 스택 객체를 생성
		Stack<String> myStack = new Stack<>();
		
		String str1 = "1 - aaa";
		String str2 = "2 - aaa";
		String str3 = "3 - aaa";
		String str4 = "4 - aaa";
		
		// 스택에 데이터 추가
		// add(), push()
		myStack.add(str1);
		myStack.add(str2);
		myStack.push(str3);
		myStack.push(str4);
		
//		System.out.println(myStack);
		
		// peek(): 스택에 맨 위의 객체를 스택에서 제거하지 않고 반환함
		String result1 = myStack.peek();
		System.out.println("result1: " + result1);
		String result2 = myStack.peek();
		System.out.println("result2: " + result2);
		System.out.println();
		
		/*
		 * 	myStack 이라는 스택 자료구조에 데이터가 채워져있는 상태라면
		 * pop(): 스택에 맨 위의 객체를 반환하고 스택에 제거한다.
		 */
		
		while(!myStack.isEmpty()) { // 스택이 비어있지 않으면
			// pop() 이라는 메소드를 이용하여 객체를 반환하고 제거한다.
			result1 = myStack.pop();
			System.out.println("result1: " + result1);
		}
	}

}
