package com.example;

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		
		this.ratio = ratio;
	}
	
	public static void main(String[] args) {

		Won2Dollar wd = new Won2Dollar(1500);
		wd.run();
	}

	@Override
	protected double convert(double src) {
		
		return (double)src / ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}

}
