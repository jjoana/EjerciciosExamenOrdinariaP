package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    private Factorial objeto;

    @BeforeEach
    void crearObjeto(){
        objeto = new Factorial();
    }

    @Test
    void factorialTestR(){
        assertEquals(2, objeto.factorialRecursivo(2));
    }

    @Test
    void factorialTestR1(){
        assertEquals(1, objeto.factorialRecursivo(1));
    }

    @Test
    void factorialTestR3(){
        assertEquals(6, objeto.factorialRecursivo(3));
    }

    @Test
    void factorialTestI(){
        assertEquals(6, objeto.factorialIterativo(3));
    }

    @Test
    void factorialTestI1(){
        assertEquals(1, objeto.factorialIterativo(1));
    }

    @Test
    void factorialTestI2(){
        assertEquals(24, objeto.factorialIterativo(4));
    }

    @Test
    void factorialLambdaTest(){
        assertEquals(2, objeto.factorialLambda(2));
    }

    @Test
    void factorialLambdaTest1(){
        assertEquals(6, objeto.factorialLambda(3));
    }
    
}
