package com.interexam;

public class RepairableEx {

	public static void main(String[] args) {

		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s = new SCV();
		
		s.repair(t);
		s.repair(d);
		s.repair(s);
	}

}
