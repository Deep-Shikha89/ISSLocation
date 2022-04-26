package com.deepshikha.ISSDemo.models;

public class IssPosition {
	//{"message": "success", "timestamp": 1642725540, "iss_position": {"latitude": "-21.5210", "longitude": "-162.9645"}}
    private double latitude;
    private double longitude;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "IssPosition [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
    
    
}
