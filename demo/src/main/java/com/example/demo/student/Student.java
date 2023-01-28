package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String Name;
    private Integer Age;
    private LocalDate dob;
    private String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public Student(String name, Integer age, LocalDate dob, String email) {
        Name = name;
        Age = age;
        this.dob = dob;
        this.email = email;
    }

    public Student(Long id, String name, Integer age, LocalDate dob, String email) {
        this.id = id;
        Name = name;
        Age = age;
        this.dob = dob;
        this.email = email;
    }

    public Student() {
    }
}
