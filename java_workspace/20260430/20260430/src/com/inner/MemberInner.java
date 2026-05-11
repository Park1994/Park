package com.inner;

public class MemberInner {
	
		int a = 10;
		private int b = 100;
		static int c =200;
		
		class Inner{
			//내부 클래스
			public void printData() {
				System.out.println("int a"+ a);
				System.out.println("private int b"+ b);
				System.out.println("static int c"+ c);
			}
		}
	
		public static void main(String[] args) {
//			MemberInner m = new MemberInner();
//			MemberInner.Inner inner =  m.new Inner();
			MemberInner.Inner inner = new MemberInner().new Inner();
			inner.printData();
		}
}
