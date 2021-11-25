package com.axis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="user_signUp_form")
@Setter
@Getter
public class UserSignUpForm {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
private String name;
private String email;
private String password;
private String mobileNo;
private String linkedInProfile;
private String Degree;
private String college;
private String branch;
private double yearOfExperience;
}
