package com.example.demo.ocs.bean;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.dem.Credentialsbean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="OCS_TBL_User_Profile")
@Data
@NoArgsConstructor

public class ProfileBean {
	@Id
	@GeneratedValue
	private String userId;
	private String firstName;
	private String lastName;
	private Date datofBirth;
	private String gender;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	private String mobileNumber;
	private String emailId;
	private String Password;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	private CredentialsBean cred;
		
	}


