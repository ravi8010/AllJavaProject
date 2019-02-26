package com.capgemini.beans;

public class City {
String cityName;

public String getCityName() {
	return cityName;
}

@Override
public String toString() {
	return "cityName=" + cityName;
}

public City(String cityName) {
	super();
	this.cityName = cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}	

}
