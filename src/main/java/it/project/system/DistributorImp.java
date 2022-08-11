package it.project.system;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import it.project.card_and_user.UserImp;

@Entity
public class DistributorImp extends AbstractSoftware {
	
	@Id
	@SequenceGenerator(name = "dis_seq", sequenceName = "dis_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dis_seq")
	@Column(name = "id")
	private Long id;	

	
}
