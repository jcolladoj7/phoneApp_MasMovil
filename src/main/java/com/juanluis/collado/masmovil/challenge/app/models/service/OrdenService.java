package com.juanluis.collado.masmovil.challenge.app.models.service;


import java.util.List;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Orden;

public interface OrdenService {

    public Orden create(Orden order);

    public void deleteOrden(Orden o);
    
    public List<Orden> findAll();

    public Orden findById(Integer id);

}
