package it.project.transport;

import java.time.LocalDate;

public abstract class AbstractTransport implements Transport {
	
	RouteImp route;
	TransportStatus status;
	private int userMaxCapacity;
	private int userActualCapacity;
	private LocalDate startTime;
	private LocalDate finishTime;
	public AbstractTransport(RouteImp route, TransportStatus status, int userMaxCapacity, int userActualCapacity,
			LocalDate startTime, LocalDate finishTime) {
		super();
		this.route = route;
		this.status = status;
		this.userMaxCapacity = userMaxCapacity;
		this.userActualCapacity = userActualCapacity;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	public AbstractTransport() {
		super();
	}
	public RouteImp getRoute() {
		return route;
	}
	public void setRoute(RouteImp route) {
		this.route = route;
	}
	public TransportStatus getStatus() {
		return status;
	}
	public void setStatus(TransportStatus status) {
		this.status = status;
	}
	public int getUserMaxCapacity() {
		return userMaxCapacity;
	}
	public void setUserMaxCapacity(int userMaxCapacity) {
		this.userMaxCapacity = userMaxCapacity;
	}
	public int getUserActualCapacity() {
		return userActualCapacity;
	}
	public void setUserActualCapacity(int userActualCapacity) {
		this.userActualCapacity = userActualCapacity;
	}
	public LocalDate getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}
	public LocalDate getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(LocalDate finishTime) {
		this.finishTime = finishTime;
	}
	
	
	
	
}
