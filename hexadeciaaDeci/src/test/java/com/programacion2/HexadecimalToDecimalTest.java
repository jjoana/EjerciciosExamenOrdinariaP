package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class HexadecimalToDecimalTest {

    public HexadecimalToDecimal objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new HexadecimalToDecimal();
    }

    @Test
    void HexaToDeciTest() {
        HexadecimalToDecimal objeto = new HexadecimalToDecimal();
        objeto.hexadecimalToBinarioR("1AB3");
        assertEquals(6835, objeto.resultado);
    }

    @Test
    void DeciToBina(){
        HexadecimalToDecimal objeto = new HexadecimalToDecimal();
        objeto.DecimalToBinarioI(6835);
        assertEquals(101000110011, objeto.resultado);
    }
    
}