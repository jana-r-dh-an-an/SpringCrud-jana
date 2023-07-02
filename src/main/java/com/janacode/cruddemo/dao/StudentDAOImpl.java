package com.janacode.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.janacode.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;




@Repository
public class StudentDAOImpl implements StudentDAO {

   //define field for entity manager
   private EntityManager entityManager;

   //inject entity manager using costructor injection
  
   public StudentDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
}








//read

@Override
public List<Student> findAll() {
   //Create Query
   TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student",Student.class);
   //return query results
   return theQuery.getResultList();
}


  

    
}
