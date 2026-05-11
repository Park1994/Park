package com.exception;

public class ExceptionEx02 {

	public static void main(String[] args) {

		System.out.println(1); 
		System.out.println(2); 
		
		try {
			
			System.out.println(3); 
			System.out.println(0/0);
		} catch (Exception e) {
			System.out.println(4); 
			// TODO: handle exception
		}
		System.out.println(5); 
	}

}
