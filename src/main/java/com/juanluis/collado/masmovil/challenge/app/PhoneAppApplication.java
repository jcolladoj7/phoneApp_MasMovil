package com.juanluis.collado.masmovil.challenge.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juanluis.collado.masmovil.challenge.app.models.service.PhoneService;

@SpringBootApplication
public class PhoneAppApplication  {

	@Autowired
	PhoneService phoneService;

	public static void main(String[] args) {
		SpringApplication.run(PhoneAppApplication.class, args);
	}


}
