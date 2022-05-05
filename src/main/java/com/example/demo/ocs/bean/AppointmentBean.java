package com.example.demo.ocs.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity 
@Table(name="OCS_TBL_Appointments")
@Data


public class AppointmentBean {
	@Id
	private String appointmentID;
	private String doctorID;
	private String patientID;
	private String appointment_Date;
	private String appointment_Time;
	

}
