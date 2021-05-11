package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer extends Person{

	@Id
	@GeneratedValue
	@Column(name="employer_id")
	private int EmployerId;
	
	@Column(name="website_name")
	private String WebsiteName;
	
	@Column(name="company_name")
	private String CompanyName;
	
	@Column(name="phone")
	private String Phone;
	
	public Employer(int id, String email, String password, String repeatPassword, int employerId, String websiteName,
			String companyName, String phone) {
		super(id, email, password, repeatPassword);
		EmployerId = employerId;
		WebsiteName = websiteName;
		CompanyName = companyName;
		Phone = phone;
	}
	
	public int getEmployerId() {
		return EmployerId;
	}
	public void setEmployerId(int employerId) {
		EmployerId = employerId;
	}
	public String getWebsiteName() {
		return WebsiteName;
	}
	public void setWebsiteName(String websiteName) {
		WebsiteName = websiteName;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
}
