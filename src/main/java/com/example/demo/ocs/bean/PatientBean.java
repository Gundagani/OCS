package com.example.demo.ocs.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="OCS_TBL_Patient")
@Data


public class PatientBean {
	@Id
	private String patientID;
	private String userID;
	private Date appointment_Date;
	private String ailment_Type;
	private String ailment_details;
	private String diagnosis_history;
	
}
