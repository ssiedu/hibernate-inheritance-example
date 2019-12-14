package com.ssi;

import org.hibernate.Session;

public class SearchEmployee {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		
		/*PermanentEmployee emp=session.get(PermanentEmployee.class, 111);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesg());*/
		
		TemporaryEmployee emp=session.get(TemporaryEmployee.class, 111);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getWages());
		System.out.println(emp.getTerm());
		session.close();

	}

}
