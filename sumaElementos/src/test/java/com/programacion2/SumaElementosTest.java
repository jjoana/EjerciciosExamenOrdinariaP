package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;


public class SumaElementosTest {

    private SumaElementos objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new SumaElementos();
    }

    @Test
    void sumaNumeroRTest(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(6, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        lista.add(0);
        lista.add(0);
        assertEquals(0, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(5);
        assertEquals(10, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest3(){
        List<Integer> lista = new ArrayList<Integer>();
        assertEquals(0, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroLambdaTest1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(6, objeto.sumaListaIterativo(lista));
    }

    @Test
    void sumaNumeroLabdaTest2(){
        List<Integer> lista = new ArrayList<Integer>();
        assertEquals(0, objeto.sumaListaIterativo(lista));
    }
}