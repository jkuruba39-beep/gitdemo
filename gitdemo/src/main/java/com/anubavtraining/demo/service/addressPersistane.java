package com.anubavtraining.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anubavtraining.demo.entites.*;

public interface addressPersistane extends JpaRepository<com.anubavtraining.demo.entites.Address, Long> {

}
