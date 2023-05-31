package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;


public class ListaEnterosTest {

    private ListaEnteros objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new ListaEnteros();
    }

    @Test
    void sumaNumeroITest(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        assertEquals(0, objeto.SumaListaParesI(lista));
    }


    @Test
    void sumaNumeroRTest(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        assertEquals(6, objeto.SumaListaParesR(lista));
    }

    @Test
    void sumaNumeroRTest1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        assertEquals(12, objeto.SumaListaParesR(lista));
    }

    @Test
    void sumaNumeroRTest2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        assertEquals(0, objeto.SumaListaParesR(lista));
    }



}