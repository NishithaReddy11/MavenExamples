package Project1;

import javax.persistence.Entity;

import javax.persistence.Id;
import Project1.Employee;
@Entity

public class SystemEngineer extends Employee{
	
	//@Id
	
	private String lang;
	private String devProfile;
	public SystemEngineer()
	{
		
	}
	
	public SystemEngineer(String lang, String devProfile) {
		super();
	
		this.lang = lang;
		this.devProfile = devProfile;
	}

	

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getDevProfile() {
		return devProfile;
	}

	public void setDevProfile(String devProfile) {
		this.devProfile = devProfile;
	}

	@Override
	public String toString() {
		
		return super.toString()+"SystemEngineer [ lang=" + lang + ", devProfile=" + devProfile + "]";
	}
	
	
}
