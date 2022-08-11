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
	public AbstractTransport() { super(); }
	
	// ===== Getters =====
	
	public RouteImp getRoute() { return route; }
	public TransportStatus getStatus() { return status;	}
	public int getUserMaxCapacity() { return userMaxCapacity; }
	public int getUserActualCapacity() { return userActualCapacity;	}
	public LocalDate getStartTime() { return startTime;	}
	public LocalDate getFinishTime() { return finishTime; }
	
	// ===== Setters =====	
	
	public void setRoute(RouteImp route) { this.route = route; }	
	public void setStatus(TransportStatus status) {	this.status = status; }	
	public void setUserMaxCapacity(int userMaxCapacity) { this.userMaxCapacity = userMaxCapacity; }
	public void setUserActualCapacity(int userActualCapacity) {	this.userActualCapacity = userActualCapacity; }
	public void setStartTime(LocalDate startTime) {	this.startTime = startTime; }
	public void setFinishTime(LocalDate finishTime) { this.finishTime = finishTime;	}	
	
}
