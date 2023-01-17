package com.eval.Exception;

import java.time.LocalDateTime;

public class MyError {

	

	private LocalDateTime timestamp;
	private String message;
	private String Details;
	public MyError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyError(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		Details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	@Override
	public String toString() {
		return "MyError [timestamp=" + timestamp + ", message=" + message + ", Details=" + Details + "]";
	}
	
	
	
	
	
}
