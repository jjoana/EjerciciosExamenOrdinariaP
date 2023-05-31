package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PotenciaTest {

    private Potencia objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new Potencia();
    }

    @Test
    void potenciaR() throws MiExcepcion {
        assertEquals(16, objeto.potenciaRecursivo(2, 4));
    }

    @Test
    void potenciaR2()throws MiExcepcion {
        assertEquals(2, objeto.potenciaRecursivo(2, 1));
    }

    @Test
    void potenciaR3()throws MiExcepcion  {
        assertEquals(1, objeto.potenciaRecursivo(2, 0));
     }

    @Test
    void potenciaR4() throws MiExcepcion {
        assertEquals(0, objeto.potenciaRecursivo(0, 2));
     }

     @Test
    void potenciaR5() throws MiExcepcion{
        assertThrows(MiExcepcion.class, () ->{
            objeto.potenciaRecursivo(0, -1);
        });
    }

    @Test
    void potenciaI1() throws MiExcepcion {
        assertEquals(0, objeto.potenciaIterativo(0, 2));
     }

     @Test
    void potenciaI2() throws MiExcepcion {
        assertEquals(1, objeto.potenciaIterativo(2, 0));
     }

     @Test
    void potenciaI3() throws MiExcepcion {
        assertEquals(16 , objeto.potenciaIterativo(2, 4));
     }  
}