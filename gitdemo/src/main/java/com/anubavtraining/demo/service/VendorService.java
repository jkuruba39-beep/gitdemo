package com.anubavtraining.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.anubavtraining.demo.entites.*;

@Service
public class VendorService {

    @Autowired
    private IvendorPersistance vendors;

    public List<com.anubavtraining.demo.entites.Vendor> getAllVendors() {
        return vendors.findAll();
    }

   
    public com.anubavtraining.demo.entites.Vendor createVendor(com.anubavtraining.demo.entites.Vendor vendorObj) {
        return vendors.save(vendorObj);
    }
    public List<com.anubavtraining.demo.entites.Vendor> searchById(String companyName) {
      return vendors.findByCompanyName(companyName);
    }
    public List<com.anubavtraining.demo.entites.Vendor> searchByGstNo(String gstNo){
    	return vendors.findByGstNo(gstNo);
    }
	public Optional<com.anubavtraining.demo.entites.Vendor> getSingleVendor(Long id) {
		//
		return vendors.findById(id);
	}
	public com.anubavtraining.demo.entites.Vendor changeVendor(com.anubavtraining.demo.entites.Vendor payload) {
		Optional<com.anubavtraining.demo.entites.Vendor> myvendor=vendors.findById(payload.getId());
		if(!myvendor.isPresent()) {
			 return new com.anubavtraining.demo.entites.Vendor(0L, "", "", "", "",null);
		}
		 return vendors.save(payload);
	}
	public String deleteVendor(Long Id) {
		vendors.deleteById(Id);
		return "vendor deleted sucessfully";
		
	}

    
}