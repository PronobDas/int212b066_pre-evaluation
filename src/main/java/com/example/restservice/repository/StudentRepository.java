package com.example.restservice.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.restservice.models.student.Student;

// write the repository of Student model to operate DOA operation using mongo-data repository here...
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String Name);
    //Student findByContactNo(String contact_no);
}