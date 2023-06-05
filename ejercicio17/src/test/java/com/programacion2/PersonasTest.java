package com.programacion2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonasTest {

    Personas personas = new Personas();
    Persona persona;

    @BeforeEach
    void crearObjeto(){
        persona = new Persona();
        persona.setNombre("Jesus");
        persona.setFechaDeNacimiento(LocalDate.of(2002, 12, 9));
        personas.lista.add(persona);

        persona = new Persona();
        persona.setNombre("Juan");
        persona.setFechaDeNacimiento(LocalDate.of(2000, 8, 6));
        personas.lista.add(persona);

        persona = new Persona();
        persona.setNombre("Daniel");
        persona.setFechaDeNacimiento(LocalDate.of(2004, 2, 10));
        personas.lista.add(persona);

        persona = new Persona();
        persona.setNombre("Martin");
        persona.setFechaDeNacimiento(LocalDate.of(2002, 5, 20));
        personas.lista.add(persona);    
    }

    @Test
    void elMasJovenTest1(){
        Persona esperado = new Persona();
        esperado.setNombre("Daniel");
        esperado.setFechaDeNacimiento(LocalDate.of(2004, 2, 10));
        assertEquals(esperado.getNombre(), personas.elMasJoven().getNombre());
    }

    @Test
    void calcularSumaEdadesTest2(){
        Persona esperado = new Persona();
        assertEquals(83, personas.calcularSumaEdades());
    }

    @Test
    void calcularEdadMinimaTest(){
        Persona esperado = new Persona();
        esperado.setNombre("Daniel");
        esperado.setFechaDeNacimiento(LocalDate.of(2003, 2, 10));
        assertEquals(20, personas.calcularEdadMinima());
    }

    @Test
    void calcularMediaEdad(){
        Persona esperado = new Persona();
        esperado.getFechaDeNacimiento();
        assertEquals(20.7, personas.calcularMediaEdad(), 0.1);

    }
}
