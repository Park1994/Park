package com.exam;

public class IPTV extends ColorTV{
	
	private String ipAddr;
	
	public IPTV(String ipAddr, int size, int color) {
		super(size, color);
		this.ipAddr = ipAddr;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ipAddr + "주소의 ");
		super.printProperty();
	}

	public static void main(String[] args) {
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
		
	}

}
