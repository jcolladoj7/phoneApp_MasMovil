package com.juanluis.collado.masmovil.challenge.app.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Orden;
import com.juanluis.collado.masmovil.challenge.app.models.service.OrdenService;

@RestController
@RequestMapping("/orders")
public class OrdenController{

    @Autowired
    OrdenService orderService;

   

    @GetMapping(value = {"","/"}, produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Orden> findAll() {
        return orderService.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Orden findById(@PathVariable Integer id, HttpServletRequest request,
                            HttpServletResponse response) {
        return orderService.findById(id);
    }
    
    @RequestMapping(value = {"","/"}, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Orden create(@RequestBody Orden orden, HttpServletRequest request,
                              HttpServletResponse response) {
    	
     
        Orden calculateOrder = orderService.create(orden);
       
        return calculateOrder;
    }

}
