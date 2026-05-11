package com.collectionexam;

/*
 * 	문제)
	하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
	학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에 
	ArrayList<Student>의 모든 학생 정보를 출력하고 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하시오.
	
	출력결과
	학생이름, 학과, 학번, 학점평균을 입력하세요.
	가길동 모바일 1 4.1
	나길동 안드로이드 2 3.9
	다길동 웹학과 3 3.5
	라길동 빅데이터 4 4.25
	-------------------------------
	이름: 가길동
	학과: 모바일
	학번: 1
	학점평균: 4.1
	-------------------------------
	-------------------------------
	이름: 가길동
	학과: 모바일
	학번: 1
	학점평균: 4.1
	-------------------------------
	-------------------------------
	이름: 가길동
	학과: 모바일
	학번: 1
	학점평균: 4.1
	-------------------------------
	-------------------------------
	이름: 가길동
	학과: 모바일
	학번: 1
	학점평균: 4.1
	-------------------------------
	학생이름: 다길동
	다길동 웹학과 3 3.5
	학생이름: 그만
	프로그램을 종료합니다.
 */

import java.util.*;
public class CollectionExam05 {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> st = new ArrayList<Student>();
	
	public void input() {
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">>");
			String name = sc.next();
			String department = sc.next();
			String id = sc.next();
			double grade = sc.nextDouble();
			
			Student student = new Student(name, department, id, grade);
			st.add(student);
		}
	}
	
	public void search() {
		while(true) {
			System.out.print("학생이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			for(int i = 0; i < st.size(); i++) {
				Student s = st.get(i);
				
				if(s.getName().equals(name)) {
					System.out.print(s.getName() + ", ");
					System.out.println(s.getDepartment() + ", ");
					System.out.println(s.getId() + ", ");
					System.out.println(s.getGrade());
					break;
				}
				else {
					System.out.println("이름이 없습니다.");
					break;
				}
			}
		}
	}
	
	public void print() {
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("-------------------------");
			System.out.println("이름: " + s.getName());
			System.out.println("학과: " + s.getDepartment());
			System.out.println("학번: " + s.getId());
			System.out.println("학점평균: " + s.getGrade());
			System.out.println("-------------------------");
		}
	}
	
	public void run() {
		input();
		print();
		search();
	}
	
	public static void main(String[] args) {

		new CollectionExam05().run();
	}

}
