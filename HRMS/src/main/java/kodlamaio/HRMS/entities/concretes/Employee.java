package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employee extends Person{

	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int EmployeeId;
	
	@Column(name="first_name")
	private String FirstName;
	
	
	@Column(name="last_name")
	private String LastName;
	
	public Employee(int id, String email, String password, String repeatPassword, int employeeId, String firstName,
			String lastName) {
		super(id, email, password, repeatPassword);
		EmployeeId = employeeId;
		FirstName = firstName;
		LastName = lastName;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
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


}
