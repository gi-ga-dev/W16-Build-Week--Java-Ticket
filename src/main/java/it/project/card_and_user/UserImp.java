package it.project.card_and_user;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserImp {
	private String name;
	private String surname;
	private String dateOfBirth;
		
	@OneToMany
	private List<UserImp> user;
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private Long id;

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

	public Long getId() {		
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
	@Override
	public String toString() {
		return "UserImp [name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", user=" + user
				+ ", id=" + id + "]";
	}
	
	
}

