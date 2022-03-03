package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerDetails;

import com.example.demo.responseModel.CustomerMasterDetailsResponse;
import com.example.demo.serviceImplementation.GeneralServiceLayer;
import com.example.demo.utility.Constants;




@RestController
@RequestMapping("/api/v1")
public class GeneralController {

	@Autowired
	private GeneralServiceLayer generalServiceLayer;
	
	@PostMapping("/UpdateCustomerDetails")
	public CustomerMasterDetailsResponse updateCustomerDetails(@Valid  @RequestBody CustomerDetails custDetails)
	{
		CustomerMasterDetailsResponse cresponse= new CustomerMasterDetailsResponse();
		
		System.out.println(custDetails.toString());
		if(!this.generalServiceLayer.updateCustomerDetails(custDetails))
		{
			cresponse.setStatus(Integer.parseInt(Constants.CustUpdate.getProperty("Status")));
			cresponse.setErrorCode(Integer.parseInt(Constants.CustUpdate.getProperty("ErrorCode")));
			cresponse.setMessageType(Constants.CustUpdate.getProperty("MessageType"));
			cresponse.setMessage(Constants.CustUpdate.getProperty("Message"));
//			return new CustomerMasterDetailsResponse(1, 0, "I", "Updated Customer Details");
			return cresponse;
		}
		else
			{
			cresponse.setStatus(Integer.parseInt(Constants.CustUpdate.getProperty("Statusfailed")));
			cresponse.setErrorCode(Integer.parseInt(Constants.CustUpdate.getProperty("ErrorCodefailed")));
			cresponse.setMessageType(Constants.CustUpdate.getProperty("MessageTypefailed"));
			cresponse.setMessage(Constants.CustUpdate.getProperty("Messagefailed"));
			//return new CustomerMasterDetailsResponse(-1, 3, "", "Updated Failed");
			return cresponse;
			}
		
		
	}

}
