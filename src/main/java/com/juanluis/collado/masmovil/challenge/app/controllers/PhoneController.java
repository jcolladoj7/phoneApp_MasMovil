package com.juanluis.collado.masmovil.challenge.app.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.juanluis.collado.masmovil.challenge.app.models.entity.Phone;
import com.juanluis.collado.masmovil.challenge.app.models.service.PhoneService;


@RestController
@RequestMapping("/phones")
public class PhoneController{

    @Autowired
    PhoneService phoneService;

    @GetMapping(value = {"","/"}, produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Phone> findAll() {
        List<Phone> phones = phoneService.findAll();
        return phones;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Phone findById(@PathVariable Integer id, HttpServletRequest request,
                            HttpServletResponse response) {
        Phone phone = phoneService.findById(id);
        return phone;
    }

}
