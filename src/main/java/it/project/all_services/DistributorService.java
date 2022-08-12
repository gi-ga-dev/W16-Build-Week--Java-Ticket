package it.project.all_services;

import java.time.LocalDate;

import it.project.system.DistributorImp;
import it.project.system.DistributorStatus;

public class DistributorService {
	
	private DistributorImp distributor1 = new DistributorImp(DistributorStatus.ACTIVE, "Firenze", null, null, LocalDate.now());
	private DistributorImp distributor2 = new DistributorImp(DistributorStatus.ACTIVE, "Roma", null, null, LocalDate.now());

	// ===== Getters =====	
	
	public DistributorImp getDistributor1() { return distributor1; }
	public DistributorImp getDistributor2() { return distributor2; }

	// ===== Setters =====	

	public void setDistributor2(DistributorImp distributor2) { this.distributor2 = distributor2; }
	public void setDistributor1(DistributorImp distributor1) { this.distributor1 = distributor1; }	
	
}
