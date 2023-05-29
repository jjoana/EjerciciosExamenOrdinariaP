package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class SumaTest {

    private Suma objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new Suma();
    }

    @Test
    void sumaNumeroRTest(){
        assertEquals(10, objeto.sumaNumeroR(4));
    }

    @Test
    void SumaNumeroRTest1(){
        assertEquals(0, objeto.sumaNumeroR(0));
    }

    @Test
    void SumaNumeroRTest2(){
        assertEquals(1, objeto.sumaNumeroR(1)); 
    }

    @Test
    void SumaNumeroITest(){
        assertEquals(0, objeto.sumaNumeroI(0));
    }

    @Test
    void SumaNumeroITest1(){
        assertEquals(1, objeto.sumaNumeroI(1));
    }

    @Test
    void SumaNumeroITest2(){
        assertEquals(10, objeto.sumaNumeroI(4));
    }

    @Test
    void SumaNumeroLambdaTest1(){
        assertEquals(10, objeto.sumaNumeroLambda(4));
    }

    @Test
    void SumaNumeroLambdaTest2(){
        assertEquals(0, objeto.sumaNumeroI(0));
    }
}

