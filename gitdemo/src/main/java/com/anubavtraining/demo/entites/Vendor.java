package com.anubavtraining.demo.entites;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import jakarta.persistence.Table;
@Entity
@Table(name="VENDOR")
public class Vendor {
	@Id
	@Column(nullable=false ,name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(nullable=false,name="Company_Name")
	public String companyName;
	@Column(nullable=false, name="Contact_No")
	public String contactNo;
	@Column(nullable=false, name="Email")
	public String email;
	@Column(nullable=false, name="Reg_Date")
	public String regDate;
	@Column(nullable=false, name="Gst_No")
	public String gstNo;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="vendor", referencedColumnName="ID")
	private List<Address> addresses = new ArrayList<>();
	
			
	public Vendor() {
		
	}
	
	
	public Vendor(Long id, String companyName, String contactNo, String email, String regDate, String gstNo) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.contactNo = contactNo;
		this.email = email;
		this.regDate = regDate;
		this.gstNo = gstNo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public List<Address> getAddresses() {
	    return addresses;
	}

	public void setAddresses(List<Address> addresses) {
	    this.addresses = addresses;
	}
	
	
		


}
