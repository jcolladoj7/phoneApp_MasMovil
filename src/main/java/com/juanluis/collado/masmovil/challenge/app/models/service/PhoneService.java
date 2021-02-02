package com.juanluis.collado.masmovil.challenge.app.models.service;

import java.util.List;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;

public interface PhoneService {

	public void loadData(List<Phone> phoneList);

	public List<Phone> findAll();

	public Phone findById(Integer id);
}
