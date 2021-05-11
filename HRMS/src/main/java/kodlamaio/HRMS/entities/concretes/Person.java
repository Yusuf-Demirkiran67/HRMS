package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int Id;
	
	
	@Column(name="email")
	private String Email;
	
	@Column(name="password")
	private String Password;
	
	@Column(name="repeat_password")
	private String RepeatPassword;
	
	public Person(int id, String email, String password, String repeatPassword) {
		super();
		Id = id;
		Email = email;
		Password = password;
		RepeatPassword = repeatPassword;
	}
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getRepeatPassword() {
		return RepeatPassword;
	}


	public void setRepeatPassword(String repeatPassword) {
		RepeatPassword = repeatPassword;
	}


	
}
