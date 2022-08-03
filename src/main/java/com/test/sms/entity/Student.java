package com.test.sms.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private  String lastName;
    private String emailId;
}
