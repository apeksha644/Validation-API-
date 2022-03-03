package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.utility.Constants;
import com.example.demo.entity.CustomerDetails;


@Repository
public class GeneralDaoLayer {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public boolean UpdateCustomerDetail( CustomerDetails cust1) {
		
		
		//     stored Procedure name 
		String typeOfProcedure = Constants.CustUpdate.getProperty("UpdateCustomerDetail");
		
		//  Entity name 
		String CustGuId = Constants.CustUpdate.getProperty("CustGuId");
		String FirstName = Constants.CustUpdate.getProperty("FirstName");
		String MiddleName = Constants.CustUpdate.getProperty("MiddleName");
		String LastName = Constants.CustUpdate.getProperty("LastName");
		String Gender = Constants.CustUpdate.getProperty("Gender");
		String DateOfBirth = Constants.CustUpdate.getProperty("DateOfBirth");
		String EmailId = Constants.CustUpdate.getProperty("EmailId");
		String MobileNo = Constants.CustUpdate.getProperty("MobileNo");
		String AddressLine1 = Constants.CustUpdate.getProperty("AddressLine1");
		String AddressLine2 = Constants.CustUpdate.getProperty("AddressLine2");
		String AddressLine3 = Constants.CustUpdate.getProperty("AddressLine3");
		String Pincode = Constants.CustUpdate.getProperty("Pincode");
		String CountryGuId = Constants.CustUpdate.getProperty("CountryGuId");
		String CityGuId = Constants.CustUpdate.getProperty("CityGuId");
		String StateGuId = Constants.CustUpdate.getProperty("StateGuId");
		String AddressType = Constants.CustUpdate.getProperty("AddressType");
		String SalutationGuId = Constants.CustUpdate.getProperty("SalutationGuId");
		String Language = Constants.CustUpdate.getProperty(" Language");
			
			
		StoredProcedureQuery query = em.createStoredProcedureQuery(typeOfProcedure)
					.registerStoredProcedureParameter(CustGuId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(FirstName, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(MiddleName, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(LastName, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(Gender, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(DateOfBirth, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(EmailId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(MobileNo, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(AddressLine1, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(AddressLine2, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(AddressLine3, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(Pincode, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(CountryGuId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(CityGuId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(StateGuId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(AddressType, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(SalutationGuId, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(Language, String.class, ParameterMode.IN)
					
					
					.setParameter(CustGuId, cust1)
					.setParameter(FirstName, cust1)
					.setParameter(MiddleName, cust1)
					.setParameter(LastName, cust1)
					.setParameter(Gender, cust1)
					.setParameter(DateOfBirth, cust1)
					.setParameter(EmailId, cust1)
					.setParameter(MobileNo, cust1)
					.setParameter(AddressLine1, cust1)
					.setParameter(AddressLine2, cust1)
					.setParameter(AddressLine3, cust1)
					.setParameter(Pincode, cust1)	
					.setParameter(CountryGuId, cust1)
					.setParameter(CityGuId, cust1)
					.setParameter(StateGuId, cust1)
					.setParameter(AddressType, cust1)
					.setParameter(SalutationGuId, cust1)
					.setParameter(Language, cust1);
		
			
					
					return 	query.execute();
			
	}	

}
