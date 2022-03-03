package com.example.demo.responseModel;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerDetails;

public class CustomerMasterDetailsResponse {
	
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	public CustomerMasterDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public CustomerMasterDetailsResponse(int status, int errorCode, String messageType, String message) {
//		super();
//		Status = status;
//		ErrorCode = errorCode;
//		MessageType = messageType;
//		Message = message;
//	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "CustomerMasterDetailsResponse [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType="
				+ MessageType + ", Message=" + Message + "]";
	}

	
	
	

}
