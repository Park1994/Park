package com.exam;
import java.net.InterfaceAddress;
import java.util.*;

public class StringStack implements Stack{
	
	//스택에 저장할 공간
	private String element[];
	//인덱스
	private int tos;
	Scanner sc = new Scanner(System.in);
	
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;//3:0 1 2
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public int length() {
		return tos+1;
	}

	@Override
	public int capacity() {
		return element.length;
	}

	@Override
	public String pop() {
		//비어 있음 null
		if(tos == -1)		
			return null;
		//비어 있지 않으면 pop
		else {
			String s = element[tos];//맨 위에 있는 데이터 가져옴
			//스택에 위치가 감소가 됨	
			tos --;
			return s;
		}			
	}

	@Override
	public boolean push(String val) {
		
		//스택이 가득 차 있으면
		if(tos == element.length-1)
			return false;
		//스택 가득차 있지 않으면 → 입력 받은 값을 저장
		else {
			tos++;
			//스택에 위치가  증가됨
			element[tos] = val;
			return true;
		}
	}

}
