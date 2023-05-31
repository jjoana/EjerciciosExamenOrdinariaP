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






}