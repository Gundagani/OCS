package com.example.demo.ocs.bean;
import java.util.Date;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="OCS_TBL_Doctor")
@Data



public class DoctorBean {
	@Id
	private String doctorID;
	private String doctorname;
	private Date DOB;
	private Date DOJ;
	private String gender;
	private String qualification;
	private String specilization;
	private int yearofexperience;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	private String contactnumber;
	private String emailID;
	

}
