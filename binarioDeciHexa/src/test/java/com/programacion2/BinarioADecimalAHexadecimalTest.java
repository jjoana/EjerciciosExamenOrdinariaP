package com.programacion2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class BinarioADecimalAHexadecimalTest {

    
    public BinarioADecimalAHexadecimal objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new BinarioADecimalAHexadecimal();
    }

    @Test
    void BinoraioTodecimalI() {

        BinarioADecimalAHexadecimal objeto = new BinarioADecimalAHexadecimal();
        objeto.binarioaDecimalI(111);

        assertEquals(7, objeto.resultado);
    }
}
