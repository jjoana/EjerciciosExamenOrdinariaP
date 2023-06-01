package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;


public class ObtenerListaTest {

    private ObtenerLista objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new ObtenerLista();
    }

    @Test
    void sumaNumeroRTest()throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(2, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest1()throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        lista.add(0);
        lista.add(0);
        assertEquals(0, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest2()throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(5);
        assertEquals(6, objeto.sumaListaRecursivo(lista));
    }

    @Test
    void sumaNumeroRTest3() throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(-1);
        lista.add(4);
        assertThrows(MiExcepcion.class, () ->{
            objeto.sumaListaRecursivo(lista);
        });
    }


    @Test
    void sumaNumeroITest1()throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        lista.add(0);
        lista.add(0);
        assertEquals(0, objeto.sumaListaIterativa(lista));
    }

    @Test
    void sumaNumeroITest2()throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(5);
        assertEquals(6, objeto.sumaListaIterativa(lista));
    }

    @Test
    void sumaNumeroITest3() throws MiExcepcion{
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(-1);
        lista.add(4);
        assertThrows(MiExcepcion.class, () ->{
            objeto.sumaListaIterativa(lista);
        });
    }
}