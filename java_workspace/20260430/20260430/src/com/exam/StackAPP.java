package com.exam;
import java.util.*;
public class StackAPP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 정장 공간의 크기 입력 :");
		int n = sc.nextInt();
		
		StringStack s  = new StringStack(n);
		
		//데이터를 입력할 준비
		while(true)
		{
			System.out.print("문자열 입력  :");
			String str= sc.next();
			
			if(str.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			boolean r = s.push(str);
			
			if(r == false)
			{
				System.out.println("스택이 꽉차서 푸시불가");
			}
			
			
			
		}
		//결과 출력
		System.out.println("스택에 저장된 문자열 팝 :");
		int len = s.length();
		for(int i=0;i<len;i++)
		{
			System.out.print(s.pop() + " ");
		}
	}
}
