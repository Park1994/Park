package com.abstractex;

public class GoodCalc extends Calculator {

	public static void main(String[] args) {
		
		GoodCalc c = new GoodCalc();
		System.out.println("두 정수의 합: " + c.add(2, 3));
		System.out.println("두 정수의 합: " + c.sub(2, 3));
		System.out.println("배열의 평균: " + c.average(new int[] {2, 3, 4}));
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

}
