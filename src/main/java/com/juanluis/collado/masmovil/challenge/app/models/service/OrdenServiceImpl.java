package com.juanluis.collado.masmovil.challenge.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanluis.collado.masmovil.challenge.app.models.dao.OrdenDAO;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Orden;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;


@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private OrdenDAO OrdenDAO;

    @Autowired
    private PhoneService phoneService;
   

    @Override
    public Orden create(Orden orden) {
    	Double totalPrice = 0.0;
    	for(Phone p : orden.getPhoneList()) {
    		Phone phone = phoneService.findById(p.getId());
    		if(phone != null) {
    			totalPrice = Double.sum(totalPrice,phone.getPrice());
    		}else {
    			return null;
    		}
    	}
    	orden.setAmount(totalPrice);
        OrdenDAO.save(orden);
        return orden;
    }

    @Override
    public void deleteOrden(Orden o) {
    	OrdenDAO.delete(o);
    }
    
    @Override
    public List<Orden> findAll() {
        return (List<Orden>) OrdenDAO.findAll();
    }

    @Override
    public Orden findById(Integer id) {
        return OrdenDAO.findById(id).orElse(null);
    }

}
