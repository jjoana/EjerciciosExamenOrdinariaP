package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class AproximacionTest {

    private Aproximacion objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new Aproximacion();
    }

    @Test
    void sumaNumeroRTest(){
        assertEquals(6.6, objeto.aproximarIterativo(3,3), 0.1);
    }

    @Test
    void sumaNumeroRTest1(){
        assertEquals(3.033, objeto.aproximarIterativo(3,10), 0.1);
    }
}