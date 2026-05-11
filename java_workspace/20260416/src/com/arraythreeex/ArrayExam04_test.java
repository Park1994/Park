package com.arraythreeex;
/*
 * 아래의 과목과 점수가 짝을 이루도록 2개의 배열을 작성하고
 * 과목이름을 입력받아 점수를 출력하는 프로그램을 작성하시오.
 * 단,"그만"을 입력하면 프로그램을 종료합니다.
 * 
 * String course[] = {"HTML","JAVA","DATABASE","JSP","SPRING"};
 * int score[] = {95,88,76,62,55};
 * 
 * 과목이름 : Jaba
 * 없는 과목입니다
 * 
 * 과목이름 : JAVA
 * JAVA의 점수가 88점 입니다.
 * 
 * 과목이름 : 그만
 * 
 * 문자열을 비교할때는 equals()
 * ==비교연산자 문자열에서는 사용할 수 없다.
 * 
 * if(course[i].equals(name)){
 * 		//과목명이 내가 입력한 문자열과 같으면		
 * 		int n = score[i];
 * }
 * 
 * 
 * 
 * 
 * */
import java.util.*;
public class ArrayExam04_test {

	public static void main(String[] args) {
		
		String course[] = {"HTML","JAVA","DATABASE","JSP","SPRING"};
		int score[] = {95,88,76,62,55};
		Scanner sc = new Scanner(System.in);
//		int i=0;
//
//		
//		for(;;)
//		{
//			
//			System.out.print("과목이름 : ");
//			String subject = sc.next();
//			
//			if(course[i].equals(subject))
//			{
//				System.out.println(course[i] +"의 점수는 " + score[i] + "점 입니다.");
//				continue;
//			}else if(subject.equals("그만"))
//				return;
//			else if(!course[i].equals(subject))
//			{
//				System.out.println("없는 과목입니다");
//				continue;
//			}
//		}
		
//		for(;;) {
//			System.out.print("과목이름 : ");
//			String name = sc.next().trim();
//			
//			if(name.equals("그만")) {
//				System.out.println("프로그램을 종료합니다.");
//				return;
//			}
//			int i;
//			for(i=0;i<score.length;i++)
//			{
//				if(course[i].equals(name))
//				{
//					System.out.println(name + "의 점수는 " + score[i]);
//					break;
//				}
//			}
//			
//			//입력한 과목이 course배열에 저장되어 있지 않으면
//			if(i == course.length)
//			{
//				System.out.println("없는 과목입니다");
//			}
//		}
		
		
		
		while(true) {
			System.out.print("과목이름 : ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			int i;
			for(i=0;i<score.length;i++)
			{
				if(course[i].equals(name))
				{
					System.out.println(name + "의 점수는 " + score[i]);
					break;
				}
			}
			
			//입력한 과목이 course배열에 저장되어 있지 않으면
			if(i == course.length)
			{
				System.out.println("없는 과목입니다");
			}
		}
	}
}
