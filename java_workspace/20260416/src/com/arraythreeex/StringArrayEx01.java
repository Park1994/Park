package com.arraythreeex;

public class StringArrayEx01 {

	public static void main(String[] args) {
		String[] name = {"사과", "배", "바나나", "체리" , "딸기", "포도"};
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for(String s : name) {
			System.out.print(s + " ");
		}
	}

}
