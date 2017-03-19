package com.cts.poc.microservice.dto;

import java.io.Serializable;

public class PutObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2903377926852878026L;

	public PutObject(String message) {

		this.message = message;
	}

	private String message;

	private String methodType = "PUT";

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetObject [message=");
		builder.append(message);
		builder.append(", methodType=");
		builder.append(methodType);
		builder.append("]");
		return builder.toString();
	}

}
