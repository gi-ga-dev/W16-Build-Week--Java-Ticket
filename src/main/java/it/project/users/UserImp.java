package it.project.users;

import java.util.List;

import javax.persistence.OneToOne;

public class UserImp {
	private String name;
	private String surname;
	private String dateOfBirth;
		
	@OneToOne	
	private List<UserImp> user;
}
