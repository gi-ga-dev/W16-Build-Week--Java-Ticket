package it.project.transport;

import java.time.LocalDate;

public abstract class AbstractTransport implements Transport {
	
	RouteImp route;
	TransportStatus status;
	private int userMaxCapacity;
	private int userActualCapacity;
	private LocalDate startTime;
	private LocalDate finishTime;

}
