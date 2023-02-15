package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.PatientDto;

public class Patientdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void insert(PatientDto patientDto) {
	// TODO Auto-generated method stub
	entityTransaction.begin();
	entityManager.persist(patientDto);
	entityTransaction.commit();
}


public void update(int pid, String pbgrp) {
	// TODO Auto-generated method stub
	
	PatientDto pdto1=entityManager.find(PatientDto.class, pid);
	pdto1.setPbgrp(pbgrp);
	
	entityTransaction.begin();
	entityManager.merge(pdto1);
	entityTransaction.commit();
}


public void delete(int pid) {
	// TODO Auto-generated method stub
	PatientDto pdto2=entityManager.find(PatientDto.class, pid);
	
	entityTransaction.begin();
	entityManager.remove(pdto2);
	entityTransaction.commit();
}
}
