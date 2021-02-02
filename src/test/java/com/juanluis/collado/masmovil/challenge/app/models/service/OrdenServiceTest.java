package com.juanluis.collado.masmovil.challenge.app.models.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.juanluis.collado.masmovil.challenge.app.UtilsTest;
import com.juanluis.collado.masmovil.challenge.app.models.entity.Orden;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdenServiceTest extends UtilsTest{

    @Autowired
    private OrdenService ordenService;


    @Before
    public void init() {
        createOrdenList();
    }

    @Test
    public void findAllTest() throws Exception {
        List<Orden> ordenes = ordenService.findAll();

        assertThat(ordenes.size(),is(equalTo(4)));
        assertEquals(ordenes.get(0).getNameCustomer(), "juanlu");
    }

    @Test
    public void findByIdTest() throws Exception {
        Orden orden = ordenService.findById(1);
        Orden orden3 = ordenService.findById(3);
        assertEquals(orden.getNameCustomer(), "juanlu");

        assertEquals(orden3.getId(), 3);
    }

}