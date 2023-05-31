package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class SumaTest {

    private Suma objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new Suma();
    }

    @Test
    void sumaNumeroRTest() throws MiExcepcion {
        assertEquals(10, objeto.sumaNumeroR(4));
    }

    @Test
    void SumaNumeroRTest1() throws MiExcepcion {
        assertEquals(0, objeto.sumaNumeroR(0));
    }

    @Test
    void SumaNumeroRTest2() throws MiExcepcion {
        assertEquals(1, objeto.sumaNumeroR(1));
    }

    @Test
    void SumaNumeroRTest3() throws MiExcepcion {
        assertThrows(MiExcepcion.class, () -> {
            objeto.sumaNumeroR(-1);
        });
    }

    @Test
    void SumaNumeroITest() throws MiExcepcion {
        assertEquals(0, objeto.sumaNumeroI(0));
    }

    @Test
    void SumaNumeroITest1() throws MiExcepcion {
        assertEquals(1, objeto.sumaNumeroI(1));
    }

    @Test
    void SumaNumeroITest2() throws MiExcepcion {
        assertEquals(10, objeto.sumaNumeroI(4));
    }

    @Test
    void SumaNumeroITest3() throws MiExcepcion {
        assertThrows(MiExcepcion.class, () -> {
            objeto.sumaNumeroI(-5);
        });
    }

    @Test
    void SumaNumeroLambdaTest1() throws MiExcepcion {
        assertEquals(10, objeto.sumaNumeroLambda(4));
    }

    @Test
    void SumaNumeroLambdaTest2() throws MiExcepcion {
        assertEquals(0, objeto.sumaNumeroLambda(0));
    }

    @Test
    void SumaNumeroLambdaTest3() throws MiExcepcion {
        assertThrows(MiExcepcion.class, () -> {
            objeto.sumaNumeroLambda(-1);
        });
    }





}
