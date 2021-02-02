package com.juanluis.collado.masmovil.challenge.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;

public interface PhoneDAO extends CrudRepository<Phone, Integer>{
	
}
