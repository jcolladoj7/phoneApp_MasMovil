package com.juanluis.collado.masmovil.challenge.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.juanluis.collado.masmovil.challenge.app.models.dao.OrdenDAO;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Orden;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;

public class UtilsTest {

	@Autowired
	private OrdenDAO ordenDAO;

	public void createOrdenList() {
		List<Orden> ordenes = new ArrayList<>();
		List<Phone> phones = new ArrayList<>();
		phones.add(new Phone(1, "", "iphone", "iphone", 2.25));
		Orden o1 = new Orden(1, "juanlu", "collado", "jc@gmail.com", phones, 0.0);
		ordenes.add(o1);
		Orden o2 = new Orden(2, "juanlu2", "collado2", "jc@gmail.com", phones, 0.0);
		ordenes.add(o2);
		Orden o3 = new Orden(3, "juanlu3", "collado3", "jc@gmail.com", phones, 0.0);
		ordenes.add(o3);
		Orden o4 = new Orden(4, "juanlu3", "collado3", "jc@gmail.com", phones, 0.0);
		ordenes.add(o4);
		for (Orden o : ordenes) {
			ordenDAO.save(o);
		}
	}
}
