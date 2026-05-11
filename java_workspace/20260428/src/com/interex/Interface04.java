package com.interex;

public class Interface04 {

	public static void main(String[] args) {
		
		SamsungPhone phone = new SamsungPhone();
		phone.printLog();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}

}
