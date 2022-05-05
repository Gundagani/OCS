package com.example.demo.ocs.doctor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value= DoctorNotFoundException.class)
	public ResponseEntity<Object> exception(DoctorNotFoundException exception){
		
		return new ResponseEntity<Object>("Doctor not found", HttpStatus.NOT_FOUND);
	}
/*	@ExceptionHandler(value= NoScheduleFoundException.class)
	public ResponseEntity<Object> exception2(NoScheduleFoundException exception){
		return new ResponseEntity<Object>("No Schedule Found",HttpStatus.NOT_FOUND);
	}*/
	
	
}
