package com.programacion2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonaTest {

    Persona objeto = new Persona();

    @BeforeEach
    void crearObjeto() {
        //objeto.fechaDeNacimiento = LocalDate.of(2002,12, 9);
    }


    @Test
    void sumaNumeroRTest(){
        long edad_esperada = 20;
        objeto.nombre = "Jesus";
        objeto.fechaDeNacimiento = LocalDate.of(2002,12, 9);

        assertEquals(edad_esperada, objeto.calcularEdad());
    }
}