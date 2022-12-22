package com.mohacarlos.ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FechaTest {
    
    public FechaTest() {
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
     * Test of getDia method, of class Fecha.
     */
    @Test
    public void testGetDia() throws ExcepcionFecha {
        Fecha instance = new Fecha(1,1,200);
        int expResult = 1;
        int result = instance.getDia();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMes method, of class Fecha.
     */
    @Test
    public void testGetMes() throws ExcepcionFecha {
        Fecha instance = new Fecha(1,9,200);
        int expResult = 9;
        int result = instance.getMes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAño method, of class Fecha.
     */
    @Test
    public void testGetAño() throws ExcepcionFecha {
        Fecha instance = new Fecha(1,1,2001);
        int expResult = 2001;
        int result = instance.getAño();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDia method, of class Fecha.
     */
    @Test
    public void testSetDia() throws ExcepcionFecha {
        int dia = 30;
        Fecha instance = new Fecha(1,1,200);
        instance.setDia(dia);
    }
    
    /**
     * Test of setDia method, of class Fecha.
     */
    @Test
    public void testSetDia1() throws ExcepcionFecha {
        int dia = 100;
        Fecha instance = new Fecha(31,1,200);
        instance.setDia(dia);
    }

    /**
     * Test of setMes method, of class Fecha.
     */
    @Test
    public void testSetMes() throws ExcepcionFecha {
        int mes = 10;
        Fecha instance = new Fecha(1,1,200);
        instance.setMes(mes);
    }
    
    /**
     * Test of setMes method, of class Fecha.
     */
    @Test
    public void testSetMes1() throws ExcepcionFecha {
        int mes = 10;
        Fecha instance = new Fecha(1,02,200);
        instance.setMes(mes);
    }

    /**
     * Test of setAño method, of class Fecha.
     */
    @Test
    public void testSetAño() throws ExcepcionFecha {
        int año = 1990;
        Fecha instance = new Fecha(1,1,200);
        instance.setAño(año);
    }

    /**
     * Test of determinarAñoBisiesto method, of class Fecha.
     */
    @Test
    public void testDeterminarAñoBisiesto() throws ExcepcionFecha {
        Fecha f = null;
        try{
            f= new Fecha(31,1,-1);
        }catch(ExcepcionFecha ex){
            assert(true);
        }
        f = new Fecha(31,1,5);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,4);
        assertEquals(f.determinarAñoBisiesto(),true);
        f = new Fecha(31,1,7);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,6);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,200);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,110);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,199);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,298);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,800);
        assertEquals(f.determinarAñoBisiesto(),true);
        f = new Fecha(31,1,600);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,799);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,1598);
        assertEquals(f.determinarAñoBisiesto(),false);
    }
    
    @Test
    public void testDeterminarAñoBisiestoCobDecisiones() throws ExcepcionFecha{
        Fecha f = new Fecha(31,1,1200);
        assertEquals(f.determinarAñoBisiesto(),true);
        f = new Fecha(31,1,1900);
        assertEquals(f.determinarAñoBisiesto(),false);
    }
    
    @Test
    public void testDeterminarAñoBisiestoMCDC() throws ExcepcionFecha{
        Fecha f = new Fecha(31,1,2004);
        assertEquals(f.determinarAñoBisiesto(),true);
        f = new Fecha(31,1,2000);
        assertEquals(f.determinarAñoBisiesto(),true);
        f = new Fecha(31,1,1);
        assertEquals(f.determinarAñoBisiesto(),false);
        f = new Fecha(31,1,700);
        assertEquals(f.determinarAñoBisiesto(),false);
    }
}
