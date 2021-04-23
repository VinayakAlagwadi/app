package com.ltts.model;

public class BoatLocation {
	
	private String latitude;
	private String longitute;
	
	
	
	
	public BoatLocation() {
		super();
	}




	public BoatLocation(String latitude, String longitute) {
		super();
		this.latitude = latitude;
		this.longitute = longitute;
	}




	public String getLatitude() {
		return latitude;
	}




	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}




	public String getLongitute() {
		return longitute;
	}




	public void setLongitute(String longitute) {
		this.longitute = longitute;
	}




	@Override
	public String toString() {
		return "BoatLocation [latitude=" + latitude + ", longitute=" + longitute + "]";
	}
	
	

}
