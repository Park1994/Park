package com.exam;

public class ColorTV extends TV{
	
	private int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
	public static void main(String[] args) {
		ColorTV myTv=new ColorTV(32,1024);
		myTv.printProperty();
	}

}
