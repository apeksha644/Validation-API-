package com.example.demo.serviceImplementation;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.GeneralDaoLayer;
import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerDetails;
import com.example.demo.responseModel.CustomerMasterDetailsResponse;

@Service
public class GeneralServiceImpl implements GeneralServiceLayer {

	@Autowired
	private GeneralDaoLayer generalDaoLayer;
	
	


	@Override
	public boolean updateCustomerDetails( CustomerDetails custDetails) {
		// TODO Auto-generated method stub
		return  generalDaoLayer.UpdateCustomerDetail(custDetails);
	}





	

}
