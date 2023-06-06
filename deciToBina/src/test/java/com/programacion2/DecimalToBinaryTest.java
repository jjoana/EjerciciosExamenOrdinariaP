package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class DecimalToBinaryTest {

    public DecimalToBinary objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new DecimalToBinary();
    }

    @Test
    void ConversionRecursivo() {

        DecimalToBinary objeto = new DecimalToBinary();

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(1);
        listaEsperada.add(1);
        listaEsperada.add(0);
        listaEsperada.add(0);

        objeto.convierteaBinarioR(12);

        assertEquals(listaEsperada, objeto.decimal_a_Binario);
    }


    @Test
    void ConversionIterativo() {

        DecimalToBinary objeto = new DecimalToBinary();

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(1);
        listaEsperada.add(1);
        listaEsperada.add(0);
        listaEsperada.add(0);

        objeto.ConversionIterativo(12);

        assertEquals(listaEsperada, objeto.decimal_a_Binario);
    }
}