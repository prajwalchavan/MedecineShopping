package com.praj.omss.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.praj.omss.entity.User;

public class monitor {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
		EntityManager mgr = factory.createEntityManager();
		
		User emp = new User();
		emp.setUserid(100);
		emp.setAddress("kalyan");
		emp.setEmail("prajwalchavan.18@gmail.com");
		emp.setFirstName("prajwal");
		emp.setLastName("chavan");
		emp.setMobileNo("9967804248");
		emp.setPassword("pc18");
		mgr.getTransaction().begin();
		mgr.persist(emp);
		mgr.getTransaction().commit();
		
		System.out.println("Employee Successfully added!!");
	}

}
