package com.janacode.cruddemo.dao;

import java.util.List;

import com.janacode.cruddemo.entity.Student;

public interface StudentDAO {
    

    //query
    List<Student> findAll();
    
}
