package com.anubavtraining.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anubavtraining.demo.entites.*;
import com.anubavtraining.demo.service.addressPersistane;
import com.anubavtraining.demo.service.addressService;

@RestController

public class AddressController {
	@Autowired
	addressService addressser;
	@RequestMapping("/address")
	public List<Address> readAllAddress(){
		return addressser.getAddress();
	}
	@PostMapping("/address")
	public Address createaddress(@RequestBody Address payload) {
		return addressser.createAddress(payload);
		
	}
	

}
