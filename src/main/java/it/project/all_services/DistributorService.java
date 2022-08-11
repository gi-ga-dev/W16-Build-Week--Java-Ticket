package it.project.all_services;

import java.time.LocalDate;

import it.project.system.DistributorImp;
import it.project.system.DistributorStatus;

public class DistributorService {
	
	private DistributorImp distributor1 = new DistributorImp(DistributorStatus.ACTIVE, "Firenze", null, null, LocalDate.now());

	// ===== Getters =====
	
	public DistributorImp getDistributor1() { return distributor1; }
	
	// ===== Setters =====	

	public void setDistributor1(DistributorImp distributor1) { this.distributor1 = distributor1; }	
	
}
