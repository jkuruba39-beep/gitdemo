package com.anubavtraining.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.http.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.anubavtraining.demo.entites.*;
import com.anubavtraining.demo.service.VendorService;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendor")
    public List<Vendor> getVendors() {
        return vendorService.getAllVendors();
    }

    @PostMapping("/vendor")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    // http://localhost:8080/vendor/search/company?company=sap
    @GetMapping("/vendor/search/company")
    public List<Vendor> searchByCompany(@RequestParam String company) {
        return vendorService.searchById(company);
    }

    // http://localhost:8080/vendor/lookup/22
    @GetMapping("/vendor/lookup/{gstNo}")
    public List<Vendor> searchBygstNum(@PathVariable String gstNo) {
        return vendorService.searchByGstNo(gstNo);
    }

    // http://localhost:8080/vendor/1
    @GetMapping("/vendor/{VendorCode}")
    public Vendor getVendorById(@PathVariable("VendorCode") Long Code) {
        Optional<Vendor> searchResult = vendorService.getSingleVendor(Code);
        if (!searchResult.isPresent()) {
            return new Vendor(0L, "", "", "", "", "");
        }
        return searchResult.get();

	}
    //http://localhost:8080/vendor/2
    @RequestMapping(method=RequestMethod.PUT,value="/vendor")
    public Vendor updateVendor(@RequestBody Vendor vendor) {
    	return vendorService.changeVendor(vendor);
    }
    //http://localhost:8080/vendor/2
    @RequestMapping(method=RequestMethod.DELETE, value="/vendor/{id}")
    public String removeVendor(@PathVariable("id") Long Id) {
    	return vendorService.deleteVendor(Id);
    }
   
}