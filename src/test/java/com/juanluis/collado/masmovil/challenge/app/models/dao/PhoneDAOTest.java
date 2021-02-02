package com.juanluis.collado.masmovil.challenge.app.models.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneDAOTest {

	@Autowired
	private PhoneDAO phoneDAO;


	@Test
	public void findByIdTest() {
		
		Phone phone = phoneDAO.findById(1).orElse(null);
		assertEquals(phone.getName(), "Iphone 12");
	}

	@Test
	public void findAllTest() {
		List<Phone> phones = (List<Phone>)phoneDAO.findAll();
		assert (phones.size() > 0);
	}

}