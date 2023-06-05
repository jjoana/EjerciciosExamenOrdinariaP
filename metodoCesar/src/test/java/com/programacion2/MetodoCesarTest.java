package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class MetodoCesarTest {

    @Test
    void nombreMetodoPrueba1() {

        MetodoCesar objeto = new MetodoCesar();

        assertEquals('A', objeto.diccionario.get(1));
    }


    @Test
    void nombreMetodoPrueba4() {

        MetodoCesar objeto = new MetodoCesar();

        assertEquals('D', objeto.diccionario.get(4));
    }

    @Test
    void leerCadenaTest1() {

        MetodoCesar objeto = new MetodoCesar();
        ArrayList<Character> miArray = new ArrayList<Character>();
        miArray.add('M');
        miArray.add('i');
        miArray.add(' ');
        miArray.add('n');
        miArray.add('o');
        miArray.add('m');
        miArray.add('b');
        miArray.add('r');
        miArray.add('e');

        assertEquals(miArray.toArray(), objeto.leerCadena("Mi nombre").toArray());
    }
    
}