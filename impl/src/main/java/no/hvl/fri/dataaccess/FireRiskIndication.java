package no.hvl.fri.dataaccess;

import java.time.ZonedDateTime;

public class FireRiskIndication {

	private int station;
	
	private double longitude,latitude;
	
	private int level;
	
	private ZonedDateTime zonedDateTime;

	public FireRiskIndication(int station, double longitude, double latitude, int level, ZonedDateTime zonedDateTime) {
		super();
		this.station = station;
		this.longitude = longitude;
		this.latitude = latitude;
		this.level = level;
		this.zonedDateTime = zonedDateTime;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}

	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}
	
	
}
