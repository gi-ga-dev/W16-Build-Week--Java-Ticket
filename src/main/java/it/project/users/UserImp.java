package it.project.users;

import java.util.List;

import javax.persistence.OneToOne;

public class UserImp {
	private String name;
	private String surname;
	private String dateOfBirth;
		
	@OneToOne	
	private List<UserImp> user;

	public UserImp(String name, String surname, String dateOfBirth, List<UserImp> user) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.user = user;
	}

	public UserImp() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<UserImp> getUser() {
		return user;
	}

	public void setUser(List<UserImp> user) {
		this.user = user;
	}
	
	
}

