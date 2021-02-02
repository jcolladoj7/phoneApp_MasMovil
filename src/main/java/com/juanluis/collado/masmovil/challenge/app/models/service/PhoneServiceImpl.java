package com.juanluis.collado.masmovil.challenge.app.models.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.juanluis.collado.masmovil.challenge.app.models.dao.PhoneDAO;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;


@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    @Override
    public void loadData(List<Phone> phoneList) {
        phoneList.stream().forEach(phone -> phoneDAO.save(phone));
    }

    @Override
    public List<Phone> findAll() {
        return (List<Phone>)phoneDAO.findAll();
    }

    @Override
    public Phone findById(Integer id) {
        return phoneDAO.findById(id).orElseThrow(() ->  new ResponseStatusException(
  	           HttpStatus.NOT_FOUND, "Phone Not Found"));
    }

}
