package com.anubavtraining.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anubavtraining.demo.entites.*;

public interface IvendorPersistance extends JpaRepository<com.anubavtraining.demo.entites.Vendor,Long> {
	List<com.anubavtraining.demo.entites.Vendor>findByCompanyName(String companyName);
	@Query(value = "SELECT * FROM public.vendor WHERE LOWER(gst_no) LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
	List<Vendor> findByGstNo(String gstno);
	
}

