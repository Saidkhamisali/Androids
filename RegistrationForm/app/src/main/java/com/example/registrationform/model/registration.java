package com.example.registrationform.model;

import android.view.ViewDebug;

import kotlin.jvm.internal.SerializedIr;

public class registration {

    private Long stId;
    private String studentName;
    private String department;
    private String address;
    private String email;
    private String password;

    public registration(Long stId, String studentName, String department, String address, String email, String password) {
        this.stId = stId;
        this.studentName = studentName;
        this.department = department;
        this.address = address;
        this.email = email;
        this.password = password;
    }
}
