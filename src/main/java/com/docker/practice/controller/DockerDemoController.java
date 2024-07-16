package com.docker.practice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.practice.enity.Student;
import com.docker.practice.repository.StudentRepo;

@RestController
@RequestMapping("/api")
public class DockerDemoController {
@Autowired
StudentRepo studentRepo;

@PostMapping("/add")
public ResponseEntity<Student> add (@RequestBody Student entity){
   Student result =studentRepo.save(entity);
   return new ResponseEntity<>(result,HttpStatus.OK);
}

@GetMapping("/all")
public ResponseEntity<List<Student>> getAll(){
   List<Student> resultlist =studentRepo.findAll();
   return new ResponseEntity<>(resultlist,HttpStatus.OK);
}

@GetMapping("/hello")
 public String hello(){
    return "I am working fine";
 }    
}
