package com.anubavtraining.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anubavtraining.demo.entites.*;
@Service
public class addressService{
	@Autowired
	addressPersistane address;
	

	public List<Address> getAddress(){
		return address.findAll();
	}
	@PostMapping("/address")
	public Address createAddress(Address payload) {
		return address.save(payload);
		
	}
	
	

}
