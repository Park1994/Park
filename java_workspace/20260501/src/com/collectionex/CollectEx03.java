package com.collectionex;

/*
 * 	큐(Queue)
 * 		큐는 FIFO(First Input, First Output) 구조로
 * 		먼저 입력된 데이터가 먼저 출력된다.
 * 		큐 인터페이스를 구현한 클래스는 큐와 관련된
 * 		다양한 메소드를 제공함 
 * 
 * 		element(), offer(), peek(), poll(), remove()
 * 	
 */

import java.util.*;
public class CollectEx03 {

	public static void main(String[] args) {

		// Queue 인스턴스 생성
		Queue<String> myQueue = new LinkedList<>();
		
		String str1 = "1 - aaa";
		String str2 = "2 - aaa";
		String str3 = "3 - aaa";
		String str4 = "4 - aaa";
		
		// Queue에 데이터 추가
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		System.out.println("값 1: " + myQueue.element());
		System.out.println("값 1: " + myQueue.element());
		System.out.println();
		
		String val;
		// peek(): 큐의 head요소를 반환하고 제거는 안함
		// 				큐가 비어있을 때는(empty())는 null을 반환함
		
		// 첫 번째 방법
		while(myQueue.peek() != null) {
			val = myQueue.poll(); // 큐의 head요소를 반환하고 제거한다.
			System.out.print("값: " + val + " ");
		}
		System.out.println();
		
		// 두 번째 방법
		while(true) {
			val = myQueue.poll();
			if(val == null) {
				break;
			}
			else {
				System.out.print("값: " + val + " ");
			}
		}
		System.out.println();
		
		// 세 번째 방법
		while(!myQueue.isEmpty()) {
			val = myQueue.poll(); // 큐의 head요소를 반환하고 제거한다.
			System.out.print("값: " + val + " ");
		}
	}

}
