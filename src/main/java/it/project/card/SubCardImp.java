package it.project.card;

import java.time.LocalDate;
import javax.persistence.OneToOne;
import it.project.users.UserImp;

public class SubCardImp {
	
	private String company;
	private int cardCode;	
	private LocalDate cardEmitDate;
	private LocalDate cardValidity; // LocalDate.now().plusYears(1)
	
	@OneToOne
	UserImp user;	
	
}
