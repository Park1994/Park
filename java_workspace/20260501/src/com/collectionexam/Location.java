package com.collectionexam;

public class Location {

	private String city;
	private double longitude; // 경도
	private double latitude; // 위도
	
	public Location(String city, double longtitude, double latitude) {

		this.city = city;
		this.longitude = longtitude;
		this.latitude = latitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
}
