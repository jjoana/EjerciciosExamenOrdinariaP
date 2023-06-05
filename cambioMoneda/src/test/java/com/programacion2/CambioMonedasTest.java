package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;


public class CambioMonedasTest {

    private CambioMoneda objeto;



    @Test
    void cambioMoendaTestI1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioRecursivo2(5, lista));
    }


    @Test
    void cambioMoendaTestI2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioRecursivo2(10, lista));
    }


    @Test
    void cambioMoendaTestI3(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(3);
        lista.add(1);

        assertEquals(3, CambioMoneda.cambioRecursivo2(9, lista));
    }


    @Test
    void cambioMoendaTestR1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioRecursivo2(5, lista));
    }

    @Test
    void cambioMoendaTestR2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioRecursivo2(6, lista));
    }


    @Test
    void cambioMoendaTestR3(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioRecursivo2(5, lista));
    }


    @Test
    void cambioMoendaTestR4(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioRecursivo2(6, lista));
    }

    @Test
    void cambioMoendaTestR5(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioRecursivo2(10, lista));
    }


    @Test
    void cambioMoendaTestLambda(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioLambda(10, lista));
    }


    @Test
    void cambioMoendaTestLambda1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(6);
        lista.add(3);
        lista.add(1);

        assertEquals(5, CambioMoneda.cambioLambda(20, lista));
    }

    @Test
    void cambioMoendaTestLambda2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(6);
        lista.add(3);

        assertEquals(5, CambioMoneda.cambioLambda(20, lista));
    }



}
