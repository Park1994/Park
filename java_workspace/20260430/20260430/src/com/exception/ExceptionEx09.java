package com.exception;

public class ExceptionEx09 {
	
	static void startInstall() {
		
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
		
	}
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		}
	}
}
