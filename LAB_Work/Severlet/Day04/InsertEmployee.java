package com.cdac.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(100);
		emp.setName("Kalpesh");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2019, 10, 10));
		em.persist(emp); 
		
		tx.commit();
		
		emf.close();
	}
}
