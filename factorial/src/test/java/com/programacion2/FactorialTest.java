package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    private Factorial objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new Factorial();
    }

    @Test
    void factorialTestR() throws MiExcepcion{
        assertEquals(2, objeto.factorialRecursivo(2));
    }

    @Test
    void factorialTestR1() throws MiExcepcion{
        assertEquals(1, objeto.factorialRecursivo(1));
    }

    @Test
    void factorialTestR3() throws MiExcepcion{
        assertEquals(6, objeto.factorialRecursivo(3));
    }

    @Test
    void factorialTestR4() throws MiExcepcion{
        assertThrows(MiExcepcion.class, () ->{
            objeto.factorialRecursivo(-1);
        });
    }

    @Test
    void factorialTestI() throws MiExcepcion{
        assertEquals(6, objeto.factorialIterativo(3));
    }

    @Test
    void factorialTestI1() throws MiExcepcion{
        assertEquals(1, objeto.factorialIterativo(1));
    }

    @Test
    void factorialTestI2() throws MiExcepcion{
        assertEquals(24, objeto.factorialIterativo(4));
    }

    @Test
    void factorialTestI3() throws MiExcepcion{
        assertThrows(MiExcepcion.class, () ->{
            objeto.factorialIterativo(-1);
        });
    }

    @Test
    void factorialLambdaTest() throws MiExcepcion{
        assertEquals(2, objeto.factorialLambda(2));
    }

    @Test
    void factorialLambdaTest1() throws MiExcepcion{
        assertEquals(6, objeto.factorialLambda(3));
    }

    @Test
    void factorialLambdaTest2() throws MiExcepcion{
        assertThrows(MiExcepcion.class, () ->{
            objeto.factorialLambda(-1);
        });
    }




    
}
