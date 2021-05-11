package kodlamaio.HRMS.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobseekers")
public class JobSeeker extends Person{

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int JobSeekerId;
	
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="date_of_birth")
	private LocalDate DateOfBirth;
	
	@Column(name="nationality_id")
    private String NationalityId ;
    
    public JobSeeker(int id, String email, String password, String repeatPassword, int jobSeekerId, String firstName,
			String lastName, LocalDate dateOfBirth, String nationalityId) {
		super(id, email, password, repeatPassword);
		JobSeekerId = jobSeekerId;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
    
	public int getJobSeekerId() {
		return JobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		JobSeekerId = jobSeekerId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	
    
	
}
