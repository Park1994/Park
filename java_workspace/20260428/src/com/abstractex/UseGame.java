package com.abstractex;

public class UseGame {

	public static void main(String[] args) {
		
		Unit[] ref = new Unit[3];
		ref[0] = new Marine();
		ref[1] = new SeigeTank();
		ref[2] = new DropShip();
		
		for(int i = 0; i < ref.length; i++) {
			// 유닛들에게 이동좌표와 메시지를 전달
			System.out.println("===================");
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("===================");
		}
	}

}
