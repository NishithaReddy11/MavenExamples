package Project1;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedQuery;

import Project1.Employee;

@Entity
@NamedQuery(name="byTestTech",query="from DeloitteConsultant where testTech=:tech")
public class DeloitteConsultant extends Employee{

	
	//@Id
	private String testTech;
	private String testProfile;
	public DeloitteConsultant()
	{
		
	}
	
	public DeloitteConsultant(String testTech, String testProfile) {
		super();
		;
		this.testTech = testTech;
		this.testProfile = testProfile;
	}

	

	public String getTestTech() {
		return testTech;
	}

	public void setTestTech(String testTech) {
		this.testTech = testTech;
	}

	public String getTestProfile() {
		return testProfile;
	}

	public void setTestProfile(String testProfile) {
		this.testProfile = testProfile;
	}

	@Override
	public String toString() {
		return "DeloitteConsultant [ testTech=" + testTech + ", testProfile=" + testProfile + "]";
	}
	
}
