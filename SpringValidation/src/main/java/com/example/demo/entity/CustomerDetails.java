package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.repository.Modifying;



public class CustomerDetails {
	
	
	@Size(min=10,message = "legnth is 8 character")
	private String CustGuId;
	
	@Size(min=10,message = "legnth is 10 character")
	private String FirstName;
	
	@Size(min=10,message = "legnth is 8 character")
	private String MiddleName;
	
	@Size(min=10,message = "legnth is 8 character")
	private String LastName;
	
	@Size(min=10,message = "legnth is 8 character")
	private String Gender;
	

	@Size(min=10,message = "legnth is 8 character")
	private String DateOfBirth;
	
	@Email
	private String EmailId;
	
	@Size(min=10,message = "10 digit number ")
	private String MobileNo;
	
	@Size(min=10,message = "legnth is 8 character")
	private String AddressLine1;
	
	@Size(min=10,message = "legnth is 8 character")
	private String AddressLine2;
	
	@Size(min=10,message = "legnth is 8 character")
	private String AddressLine3;
	
	@Size(min=10,message = "legnth is 8 character")
	private String Pincode;
	
	@Size(min=10,message = "legnth is 8 character")
	private String CountryGuId;
	
	@Size(min=10,message = "legnth is 8 character")
	private String CityGuId;
	
	@Size(min=10,message = "legnth is 8 character")
	private String StateGuId;
	
	
	@Size(min=10)
	private String AddressType;
	
	@Size(min=10,message = "legnth is 8 character")
	private String SalutationGuId;
	
	@Size(min=10,message = "legnth is 8 character")
	private String Language;
	
	
	
	public CustomerDetails(@Size(min = 10, message = "legnth is 8 character") String custGuId,
			@Size(min = 10, message = "legnth is 8 character") String firstName,
			@Size(min = 10, message = "legnth is 8 character") String middleName,
			@Size(min = 10, message = "legnth is 8 character") String lastName,
			@Size(min = 10, message = "legnth is 8 character") String gender,
			@Size(min = 10, message = "legnth is 8 character") String dateOfBirth,
			@Size(min = 10, message = "legnth is 8 character") String emailId,
			@Size(min = 10, message = "legnth is 8 character") String mobileNo,
			@Size(min = 10, message = "legnth is 8 character") String addressLine1,
			@Size(min = 10, message = "legnth is 8 character") String addressLine2,
			@Size(min = 10, message = "legnth is 8 character") String addressLine3,
			@Size(min = 10, message = "legnth is 8 character") String pincode,
			@Size(min = 10, message = "legnth is 8 character") String countryGuId,
			@Size(min = 10, message = "legnth is 8 character") String cityGuId,
			@Size(min = 10, message = "legnth is 8 character") String stateGuId,
			@Size(min = 10, message = "legnth is 8 character") String addressType,
			@Size(min = 10, message = "legnth is 8 character") String salutationGuId,
			@Size(min = 10, message = "legnth is 8 character") String language) {
		super();
		CustGuId = custGuId;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		EmailId = emailId;
		MobileNo = mobileNo;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		AddressLine3 = addressLine3;
		Pincode = pincode;
		CountryGuId = countryGuId;
		CityGuId = cityGuId;
		StateGuId = stateGuId;
		AddressType = addressType;
		SalutationGuId = salutationGuId;
		Language = language;
	}
	public String getCustGuId() {
		return CustGuId;
	}
	public void setCustGuId(String custGuId) {
		CustGuId = custGuId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return AddressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getCountryGuId() {
		return CountryGuId;
	}
	public void setCountryGuId(String countryGuId) {
		CountryGuId = countryGuId;
	}
	public String getCityGuId() {
		return CityGuId;
	}
	public void setCityGuId(String cityGuId) {
		CityGuId = cityGuId;
	}
	public String getStateGuId() {
		return StateGuId;
	}
	public void setStateGuId(String stateGuId) {
		StateGuId = stateGuId;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getSalutationGuId() {
		return SalutationGuId;
	}
	public void setSalutationGuId(String salutationGuId) {
		SalutationGuId = salutationGuId;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
//	@Override
//	public String toString() {
//		return "CustomerDetails [CustGuId=" + CustGuId + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName
//				+ ", LastName=" + LastName + ", Gender=" + Gender + ", DateOfBirth=" + DateOfBirth + ", EmailId="
//				+ EmailId + ", MobileNo=" + MobileNo + ", AddressLine1=" + AddressLine1 + ", AddressLine2="
//				+ AddressLine2 + ", AddressLine3=" + AddressLine3 + ", Pincode=" + Pincode + ", CountryGuId="
//				+ CountryGuId + ", CityGuId=" + CityGuId + ", StateGuId=" + StateGuId + ", AddressType=" + AddressType
//				+ ", SalutationGuId=" + SalutationGuId + ", Language=" + Language + "]";
//	}
	
	
	
}
