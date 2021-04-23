package com.ltts.model;

public class BoatEssentials {

	
	private String hull_Id;
	private String imei_Id;
	private double boat_Speed;
	private BoatLocation boat_loc;
	
	
	public BoatEssentials() {
		super();
	}


	public BoatEssentials(String hull_Id, String imei_Id, double boat_Speed, BoatLocation boat_loc) {
		super();
		this.hull_Id = hull_Id;
		this.imei_Id = imei_Id;
		this.boat_Speed = boat_Speed;
		this.boat_loc = boat_loc;
	}

	public String getHull_Id() {
		return hull_Id;
	}


	public void setHull_Id(String hull_Id) {
		this.hull_Id = hull_Id;
	}


	public String getImei_Id() {
		return imei_Id;
	}


	public void setImei_Id(String imei_Id) {
		this.imei_Id = imei_Id;
	}


	public double getBoat_Speed() {
		return boat_Speed;
	}

	public void setBoat_Speed(double boat_Speed) {
		this.boat_Speed = boat_Speed;
	}




	public BoatLocation getBoat_loc() {
		return boat_loc;
	}




	public void setBoat_loc(BoatLocation boat_loc) {
		this.boat_loc = boat_loc;
	}


	@Override
	public String toString() {
		return "BoatEssentials [hull_Id=" + hull_Id + ", imei_Id=" + imei_Id + ", boat_Speed=" + boat_Speed
				+ ", boat_loc=" + boat_loc + "]";
	}
	
	

	
}
