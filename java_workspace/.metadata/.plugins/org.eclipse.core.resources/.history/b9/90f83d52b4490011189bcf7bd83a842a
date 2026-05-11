package com.test;
import java.util.*;
import java.util.Collections;
//값 입력받고 -1 입력받으면 종료되고 최대값 출력
public class Exam01 {

	
	
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int num=0;
		//사용자로부터 수를 입력 받아야합니다. ( Scanner 사용 및 while문 이용 )
		while(true)
		{
			System.out.print("값 입력 :  (-1입력하면 종료 ) :");
			num =sc.nextInt();
			if(num == -1)
			{
				System.out.println("종료");
				break;
			}
			list.add(num);
		}		
		Integer a =Collections.max(list);
		System.out.println(a);
		//가장 큰 수 출력
		print(list);
//		int max = list.get(0);
//		for(int i=0;i<list.size();i++)
//		{
//			if(max<list.get(i)) {
//				max = list.get(i);//벡터에 저장된 데이터를 하나씩 비교하면서 max 보다 큰 수가 있으면 max 값을 변경
//			}
//		}
//		System.out.println(max);
		
	}
	static void print(Vector<Integer> list)
	{
		int max = list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(max<list.get(i)) {
				max = list.get(i);//벡터에 저장된 데이터를 하나씩 비교하면서 max 보다 큰 수가 있으면 max 값을 변경
			}
		}
		System.out.println(max);
	}
}
