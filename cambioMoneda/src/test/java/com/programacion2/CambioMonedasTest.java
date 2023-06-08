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

        assertEquals(2, CambioMoneda.cambioIterativo(5, lista));
    }

    @Test
    void cambioMoendaTestI2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioIterativo(10, lista));
    }

    @Test
    void cambioMonedaTestR1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioIterativo(5, lista));
    }

    @Test
    void cambioMonedaTestR2(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioRecursivo(10, lista));
    }

    @Test
    void cambioMonedaTestLambda(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(4, CambioMoneda.cambioIterativo(10, lista));
    }

    @Test
    void cambioMonedaTestLambda1(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(1);

        assertEquals(2, CambioMoneda.cambioIterativo(5, lista));
    }
       
}