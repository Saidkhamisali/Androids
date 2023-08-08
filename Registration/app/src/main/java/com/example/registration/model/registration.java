package com.example.registration.model;


import com.google.gson.annotations.SerializedName;

public class registration {
    private Long stId;
    private String studentName;
    private String department;
    private String address;
    private String email;
    private String password;

    public Long getStId() {
        return stId;
    }

    public registration(Long stId) {
        this.stId = stId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
