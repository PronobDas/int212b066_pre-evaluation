package com.example.restservice.models.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Create a model by using the collection name as your Intern ID
// as example if your Intern ID is int212b003 then the collection name as follow
@Document(collection = "int212b066")
public class Student {
    private String name;
    private String email;
    private int contact_no;
    private String DoB;
}