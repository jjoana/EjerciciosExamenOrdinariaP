package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class MediaAritmeticaTest {

    private MediaAritmetica objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new MediaAritmetica();
    }

    @Test
    void mediaAritmeticaTestR() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        assertEquals(1.99, objeto.mediaAritmeticaR(3, lista), 0.01);
    }

    @Test
    void mediaAritmeticaTestR1() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(5.0);
        lista.add(5.0);
        lista.add(5.0);
        lista.add(5.0);
        lista.add(5.0);
        assertEquals(5.0, objeto.mediaAritmeticaR(5, lista), 0.01);
    }

    @Test
    void mediaAritmeticaTestR2() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(0.0);
        assertEquals(0, objeto.mediaAritmeticaR(1, lista), 0.01);
    }

}
