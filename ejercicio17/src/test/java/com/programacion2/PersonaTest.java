package com.programacion2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonaTest {
    Persona objeto = new Persona();

    @Test
    void calcularEdadTest1() throws MiExcepcion{
        long edad = 20;
        objeto.setNombre("Jesus"); 
        objeto.getNombre();
        objeto.setFechaDeNacimiento(LocalDate.of(2002, 12, 9));
        objeto.getFechaDeNacimiento();

        assertEquals(edad, objeto.calcularEdad());
    }

    @Test
    void SumaNumeroLambdaTest3() throws MiExcepcion {
        objeto.setNombre("Jesus");
        objeto.setFechaDeNacimiento(LocalDate.of(2052, 12, 9));

        assertThrows(MiExcepcion.class, () -> {
            objeto.calcularEdad();
        });
    }

}