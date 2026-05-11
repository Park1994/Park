package com.collectionex;
import java.util.*;
public class CollectEx04 {
	
	// 문자 배열 선언 및 초기화
		private static final String[] Colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<String>();
		
		// offer: 큐에 데이터를 저장
		for(String str : Colors) {
			qu.offer(str);
		}
		
		// poll: 큐에 head요소를 리턴하고 삭제한다.
		while(qu.peek() != null ) {
			System.out.print(qu.poll() + " ");
		}
		System.out.println();
	}

}
