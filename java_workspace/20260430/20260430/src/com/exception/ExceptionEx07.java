package com.exception;

import java.io.File;

public class ExceptionEx07 {

	static File createFile(String name) {
		try {
			if(name == null || name.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		} catch (Exception e) {
			name = "제목없음.txt";
		}finally {
			File f = new File(name);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일 생성 완료");
	}
}
