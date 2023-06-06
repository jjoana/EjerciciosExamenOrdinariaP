package com.programacion2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class DecimalToBinaryTestII {

    public DecimalToBinaryII objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new DecimalToBinaryII();
    }

    @Test
    void ConversionRecursivo() {

        DecimalToBinaryII objeto = new DecimalToBinaryII();
        objeto.ConversionRecursivo(12);

        assertEquals(1100, objeto.resultado);
    }

    @Test
    void ConversionRecursivoI() {

        DecimalToBinaryII objeto = new DecimalToBinaryII();
        objeto.ConversionRecursivo(16);

        assertEquals(10000, objeto.resultado);
    }


    @Test
    void ConversiomIterativo() {

        DecimalToBinaryII objeto = new DecimalToBinaryII();
        objeto.ConversionIterativo(12);

        assertEquals(1100, objeto.resultado);
    }


    @Test
    void ConversionRecursivoI2() {

        DecimalToBinaryII objeto = new DecimalToBinaryII();
        objeto.ConversionIterativo(16);

        assertEquals(10000, objeto.resultado);
    }
}