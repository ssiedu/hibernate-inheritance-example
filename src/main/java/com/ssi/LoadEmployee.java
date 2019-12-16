package com.ssi;

import org.hibernate.Session;

public class LoadEmployee {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		
		System.out.println("Calling Load Now : ");
		Employee emp=session.get(Employee.class, 111);
		System.out.println(emp);
		//Employee emp=session.load(Employee.class, 111);
		//System.out.println("Fetching Name of Employee from Employee Object");
		//System.out.println(emp.getEname());
		session.close();
	}

}
