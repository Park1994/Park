package com.abstractex;

public class UseDraw {

	public static void main(String[] args) {
		
		Diagram[] di = new Diagram[3];
		di[0] = new Triangle();
		di[1] = new Rectangle();
		di[2] = new Circle();
		
		for(int i = 0; i < di.length; i++) {
			di[i].draw();
		}
	}

}
