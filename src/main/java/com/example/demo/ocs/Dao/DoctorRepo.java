package com.example.demo.ocs.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ocs.bean.DoctorBean;

public interface  DoctorRepo extends JpaRepository<DoctorBean, String> {
	
	DoctorBean findByDoctorID(String doctorID);
	

}
