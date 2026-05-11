package com.exception;

import java.io.File;
import java.util.*;
public class ExceptionEx08 {
	
	static File createFile(String name) throws Exception{
			if(name == null || name.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
//			name = "제목없음.txt";
			File f = new File(name);
			f.createNewFile();
			return f;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("파일명 입력");
		String ff = sc.next();
		try {
			File f = createFile(ff);
			System.out.println(f.getName() +"파일 성공적 생성");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력해주세요.");
		}
	}
}
