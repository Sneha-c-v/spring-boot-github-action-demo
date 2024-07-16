package com.docker.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.practice.enity.Student;

@Repository
public interface StudentRepo  extends  JpaRepository<Student,Integer>{

    

}
