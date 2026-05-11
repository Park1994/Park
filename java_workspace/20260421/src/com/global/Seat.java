package com.global;

public class Seat {

	private String name;
	
	public String getName() {
		return name;
	}

	public Seat() {
		name = null;
	}
	
	public void cancel() {
		name = null;
	}
	
	public void reserve(String name) {
		this.name = name;
	}
	
	public boolean isOccupied() { // 예약 여부를 판정하는 메소드
		if(name == null) { // 좌석이 예약되어 있으면 true, 없으면 false 를 반환함
			return false; // 이름이 없는 경우 false 반환
		}
		else { // 이름이 있는 경우에는 true 를 반환함
			return true;
		}
	}
	
	// 이름이 존재하는지 판정
	public boolean match(String name) {
		// 내가 입력 이름이 클래스에 저장되어 잇는지 -> 있으면 이름이 같은지를 판정함
		return name.equals(this.name);
		// 매개변수로 전달받은 이름이 있으면 이름을 리턴한다.
	}
}
