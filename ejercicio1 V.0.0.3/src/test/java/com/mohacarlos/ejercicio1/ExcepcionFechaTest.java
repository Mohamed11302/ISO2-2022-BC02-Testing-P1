package com.mohacarlos.ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExcepcionFechaTest {
    
    public ExcepcionFechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class ExcepcionFecha.
     */
    @Test
    public void testGetMessage() {
        ExcepcionFecha instance = new ExcepcionFecha(1);
        String expResult = "Error, el valor del dia debe estar entre 1 y 31";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(2);
        expResult = "Error, los dias de este mes deben ser 31";
        result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(3);
        expResult = "Error, los dias de este mes deben ser 30";
        result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(4);
        expResult = "Error, los dias de este mes deben ser 28";
        result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(5);
        expResult = "Error, los dias de este mes deben ser 29";
        result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(6);
        expResult = "Error, el valor del mes debe estar entre 1 y 12";
        result = instance.getMessage();
        assertEquals(expResult, result);
        instance = new ExcepcionFecha(7);
        expResult = "Error, el valor del año debe ser un numero positivo";
        result = instance.getMessage();
        assertEquals(expResult, result);
    }
}
