package Project1;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(SystemEngineer.class)
				.addAnnotatedClass(DeloitteConsultant.class)
				.buildSessionFactory();
//    SystemEngineer s=new SystemEngineer();
//    s.setEmpId(102);
//    s.setDevProfile("Web Dev");
//    s.setEmpName("Nishitha");
//    s.setLang("lang");
//    
//    DeloitteConsultant d=new DeloitteConsultant();
//    d.setEmpId(502);
//    d.setTestProfile("sysTesting");
//    d.setEmpName("Tejaswini");
//    d.setTestTech("Selenium");
    Session ssn=sf.openSession();
//    Query q=ssn.createQuery("from SystemEngineer where lang='lang'");
//    SystemEngineer s=(SystemEngineer)q.getSingleResult();
    	Query q=ssn.createNamedQuery("byTestTech");
    	q.setParameter("tech", "Selenium");
    	DeloitteConsultant d=(DeloitteConsultant)q.getSingleResult();
//	Transaction tx=ssn.beginTransaction();
//	ssn.save(s);
//	ssn.save(d);
//	tx.commit();
	ssn.close();
//	 System.out.println("EmpId:"+s.getEmpId());
//	 System.out.println("EmpName:"+s.getEmpName());
//	 System.out.println("devProfile:"+s.getDevProfile());
//	 System.out.println("Language:"+s.getLang());
	 System.out.println("EmpId:"+d.getEmpId());
	 System.out.println("EmpName:"+d.getEmpName());
	 System.out.println("Test Profile:"+d.getTestProfile());
	 System.out.println("Tech:"+d.getTestTech());
    }
}
