package it.project.transport;

import java.time.LocalDate;

public class RouteImp {	
	
	private StorageAreaImp startArea;	
	private String endArea;	
	private int averageTime;
	private int stopsNumber;
	public RouteImp(StorageAreaImp startArea, String endArea, int averageTime, int stopsNumber) {
		super();
		this.startArea = startArea;
		this.endArea = endArea;
		this.averageTime = averageTime;
		this.stopsNumber = stopsNumber;
	}
	public RouteImp() {
		super();
	}
	public StorageAreaImp getStartArea() {
		return startArea;
	}
	public void setStartArea(StorageAreaImp startArea) {
		this.startArea = startArea;
	}
	public String getEndArea() {
		return endArea;
	}
	public void setEndArea(String endArea) {
		this.endArea = endArea;
	}
	public int getAverageTime() {
		return averageTime;
	}
	public void setAverageTime(int averageTime) {
		this.averageTime = averageTime;
	}
	public int getStopsNumber() {
		return stopsNumber;
	}
	public void setStopsNumber(int stopsNumber) {
		this.stopsNumber = stopsNumber;
	} 
	
	
}
