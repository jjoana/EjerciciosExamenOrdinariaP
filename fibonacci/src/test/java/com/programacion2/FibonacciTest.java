package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private Fibonacci objeto;

    @BeforeEach
    void crearObjeto() {
        objeto = new Fibonacci();
    }

    @Test
    void potenciaR(){
        assertEquals(3, objeto.FibonacciR(4));
    }

    @Test
    void potenciaR2(){
        assertEquals(1, objeto.FibonacciR(2));
    }

    @Test
    void potenciaR3(){
        assertEquals(0, objeto.FibonacciR(0));
    }

    @Test
    void potenciaR4(){
        assertEquals(1, objeto.FibonacciR(1));
    }

    @Test
    void potenciaR5(){
        assertEquals(1, objeto.FibonacciR(2));
    }

    @Test
    void potenciaR6(){
        assertEquals(2, objeto.FibonacciR(3));
    }

    @Test
    void potenciaR7(){
        assertEquals(5, objeto.FibonacciR(5));
    }

    @Test
    void potenciaR8(){
        assertEquals(8, objeto.FibonacciR(6));
    }

    @Test
    void potenciaR9(){
        assertEquals(13, objeto.FibonacciR(7));
    }

    @Test
    void potenciaR10(){
        assertEquals(21, objeto.FibonacciR(8));
    }


    @Test
    void potenciaI11(){
        assertEquals(0, objeto.FibonacciI(0));
    }

    @Test
    void potenciaI2(){
        assertEquals(1, objeto.FibonacciI(1));
    }

    @Test
    void potenciaI3(){
        assertEquals(1, objeto.FibonacciI(2));
    }

    @Test
    void potenciaI4(){
        assertEquals(2, objeto.FibonacciI(3));
    }

    @Test
    void potenciaI5(){
        assertEquals(3, objeto.FibonacciI(4));
    }

    @Test
    void potenciaI6(){
        assertEquals(5, objeto.FibonacciI(5));
    }

    @Test
    void potenciaI7(){
        assertEquals(8, objeto.FibonacciI(6));
    }

    @Test
    void potenciaLambda1(){
        assertEquals(0, objeto.FibonacciI(0));
    }

    @Test
    void potenciaLambda2(){
        assertEquals(1, objeto.FibonacciI(1));
    }

    @Test
    void potenciaLambda3(){
        assertEquals(1, objeto.FibonacciI(2));
    }

    @Test
    void potenciaLambda4(){
        assertEquals(2, objeto.FibonacciI(3));
    }

    @Test
    void potenciaLambda5(){
        assertEquals(3, objeto.FibonacciI(4));
    }










}