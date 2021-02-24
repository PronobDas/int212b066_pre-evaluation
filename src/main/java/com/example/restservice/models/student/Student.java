package com.example.restservice.models.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Create a model by using the collection name as your Intern ID
// as example if your Intern ID is int212b003 then the collection name as follow
@Document(collection = "int212b066")
public class Student {
    @Id
    private String id;

    private String name;
    private String email;
    private String contact_no;
    private String dateOB;

    public Student(){

    }

    public Student(String name, String email, String contact_no, String dateOB) {
        this.name = name;
        this.email = email;
        this.contact_no = contact_no;
        this.dateOB = dateOB;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public String getDateOB() {
        return dateOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public void setDateOB(String doB) {
        dateOB = doB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact_no='" + contact_no + '\'' +
                ", dateOB='" + dateOB + '\'' +
                '}';
    }
}