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
        assertEquals(2, objeto.mediaAritmeticaR(3, lista), 0.01);
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

    @Test
    void mediaAritmeticaTestI() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(0.0);
        assertEquals(0, objeto.mediaAritmeticaIterativa(lista, 1));
    }

    @Test
    void mediaAritmeticaTest2() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        int tamano = lista.size();
        assertEquals(2.0, objeto.mediaAritmeticaIterativa(lista, tamano), 0.01);
    }
    @Test
    void desviacionTipicaTest2() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        assertEquals(0.81, objeto.desviacionTipicaR(lista), 0.01);
    }

    @Test
    void desviacionTipicaTestI(){
        List<Double> lista = new ArrayList<Double>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        int tamano = lista.size();
        float mediaAritmetica = objeto.mediaAritmeticaIterativa(lista, tamano);
        assertEquals(0.81, objeto.desviacionTipicaI(lista, tamano, mediaAritmetica) , 0.01);
    }
}
