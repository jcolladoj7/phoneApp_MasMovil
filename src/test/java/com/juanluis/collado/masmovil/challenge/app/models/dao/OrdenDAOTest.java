package com.juanluis.collado.masmovil.challenge.app.models.dao;

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
public class OrdenDAOTest extends UtilsTest{

    @Autowired
    private OrdenDAO ordenDAO;


    @Before
    public void init() {
        createOrdenList();
    }

    @Test
    public void findAllTest() throws Exception {
        List<Orden> ordenes = (List<Orden>)ordenDAO.findAll();

        assertThat(ordenes.size(),is(equalTo(4)));
        assertEquals(ordenes.get(0).getNameCustomer(), "juanlu");
    }

    @Test
    public void findByIdTest() throws Exception {
        Orden orden = ordenDAO.findById(1).orElse(null);
        Orden orden3 = ordenDAO.findById(3).orElse(null);
       
        assertEquals(orden.getNameCustomer(), "juanlu");
        assertEquals(orden3.getId(), 3);
    }

    
}