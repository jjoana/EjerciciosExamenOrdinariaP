package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class BinarioToDecimalTest {

    public BinarioToDecimal objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new BinarioToDecimal();
    }

    @Test
    void BinoraioTodecimalI() {

        BinarioToDecimal objeto = new BinarioToDecimal();
        objeto.binarioaDecimalI(111);

        assertEquals(7, objeto.resultado);
    }

    @Test
    void BinoraioTodecimalR() {

        BinarioToDecimal objeto = new BinarioToDecimal();
        objeto.binarioaDecimalI(1011101);

        assertEquals(93, objeto.resultado);
    }
}
