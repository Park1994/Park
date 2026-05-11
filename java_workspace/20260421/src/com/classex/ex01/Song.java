package com.classex.ex01;

/*
 * 	노래 한 곡을 나타내는 Song 클래스를 완성하시오.
 * 
 * 	필드 구성
 * 		노래의 제목: title
 * 		가수		  : artist
 * 		노래가 발표된 년도: year
 * 		국적을 나타내는: country
 * 
 * 	생성자와 메소드 구성은 아래와 같다.
 * 		-생성자 2개: 기본 생성자, 매개변수로 모든 필드를 초기화 하는 생성자
 * 		-노래 정보를 출력하는 show() 메소드
 * 
 * 		main() 메소드는 1978년, 스웨덴 국적의 ABBA가 부른 Dancing Queen 을
 * 		song 객체로 생성하고, show() 메소드를 이용하여
 * 		노래의 정보를 출력하시오.
 * 
 * 		출력 결과
 * 		1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen
 */

public class Song {
	// 필드 구성
	private String title;
	private String artist;
	private String year;
	private String country;
	
	public Song() {
		
	}
	
	public Song(String a, String b, String c, String d) {
		this.title = a;
		this.artist = b;
		this.year = c;
		this.country =d;
	}
	
	public void show() {
		System.out.println(year + " " + country + " 국적의 " + artist +"가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Song sa = new Song();
		Song no = new Song("Dancing Queen", "ABBA", "1978년", "스웨덴");
		no.show();
	}
}
