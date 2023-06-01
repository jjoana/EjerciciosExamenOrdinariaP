package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class MatematicasTest {

    private Matematicas objeto;

    @BeforeEach
    void crearObjeto() {
    }

    @Test
    void sumaNumeroRTest() throws MiExcepcion{
        assertEquals(1, Matematicas.integralEXCuadrado(0, 1, 1));
    }

    @Test
    void sumaNumeroRTest2()throws MiExcepcion{
        assertEquals(3.71, Matematicas.integralEXCuadrado(0, 2, 1), 0.1);
    }

    @Test
    void sumaNumeroRTest3()throws MiExcepcion{ 
        assertEquals(58.3, Matematicas.integralEXCuadrado(0, 3, 1), 0.1);
    }

    @Test
    void sumaNumeroITest()throws MiExcepcion{
        assertEquals(1, Matematicas.integralEXCuadradoI(0, 1, 1));
    }

    @Test
    void sumaNumeroITest2()throws MiExcepcion{
        assertEquals(2.71, Matematicas.integralEXCuadradoI(0, 2, 1), 0.1);
    }

    @Test
    void sumaNumeroITest3()throws MiExcepcion{ 
        assertEquals(54.5, Matematicas.integralEXCuadradoI(0, 3, 1), 0.1);
    }
}