package com.eval.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyError> MyexcHandler(CustomerException ie,WebRequest req){
		MyError me=new MyError();
		me.setTimestamp(LocalDateTime.now());
		me.setDetails(req.getDescription(false));
		me.setMessage(ie.getMessage());
		return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> MycommonexcHandler(Exception ie,WebRequest req){
		MyError me=new MyError();
		me.setTimestamp(LocalDateTime.now());
		me.setDetails(req.getDescription(false));
		me.setMessage(ie.getMessage());
		return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError> NoHandlerFoundException(NoHandlerFoundException ie,WebRequest req){
		MyError me=new MyError();
		me.setTimestamp(LocalDateTime.now());
		me.setDetails(req.getDescription(false));
		me.setMessage(ie.getMessage());
		return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);
	}
}
