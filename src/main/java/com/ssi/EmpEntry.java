package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		PermanentEmployee e1=new PermanentEmployee(); 
		e1.setEcode(111); e1.setEname("AAA"); e1.setSalary(50000); e1.setDesg("Manager");
		PermanentEmployee e2=new PermanentEmployee();
		e2.setEcode(112); e2.setEname("BBB"); e2.setSalary(75000); e2.setDesg("Sr.Manager");
		
		TemporaryEmployee e3=new TemporaryEmployee();
		e3.setEcode(113); e3.setEname("CCC"); e3.setTerm(120); e3.setWages(300);
		TemporaryEmployee e4=new TemporaryEmployee();
		e4.setEcode(114); e4.setEname("DDD"); e4.setTerm(150); e4.setWages(500);
		
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		
		tr.commit();
		session.close();
		
		System.out.println("Data Stored Successfully");

	}

}
