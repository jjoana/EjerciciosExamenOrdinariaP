package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class HexaADeciABinaTest {
    public HexaADeciABina objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new HexaADeciABina();
    }

    @Test
    void HexaToDeciTest() {
        HexaADeciABina objeto = new HexaADeciABina();
        objeto.hexadecimalToBinarioR("1AB3");
        assertEquals(15265, objeto.resultado);
    }

    @Test
    void DeciToBina(){
        HexaADeciABina objeto = new HexaADeciABina();
        objeto.DecimalToBinarioI(6835);
        assertEquals(1101010110011L, objeto.resultado);
    }

    @Test
    void DeciToBina1(){
        HexaADeciABina objeto = new HexaADeciABina();
        objeto.DecimalToBinarioI(18);
        assertEquals(10010, objeto.resultado);
    }

    @Test
    void DeciToBina2(){
        HexaADeciABina objeto = new HexaADeciABina();
        objeto.hexadecimalToBinarioR("1AB3");
        assertEquals(15265, objeto.resultado);
    }

    @Test
    void DeciToBina3(){
        HexaADeciABina objeto = new HexaADeciABina();
        objeto.hexadecimalToBinarioR("1AB3");
        assertEquals(15265, objeto.resultado);
    }
}
