package com.programacion2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonasTest {

    Personas listaPersonas = new Personas();
    Persona objeto = new Persona();

    @BeforeEach
    void crearObjeto() {
        objeto.nombre = "Jesus";
        objeto.fechaDeNacimiento = LocalDate.of(2004,12, 9);
        listaPersonas.lista.add(objeto);

        objeto = new Persona();
        objeto.nombre = "Juan";
        objeto.fechaDeNacimiento = LocalDate.of(2003,11, 6);
        listaPersonas.lista.add(objeto);

        objeto = new Persona();
        objeto.nombre = "Daniel";
        objeto.fechaDeNacimiento = LocalDate.of(2000,8, 9);
        listaPersonas.lista.add(objeto);

        objeto = new Persona();
        objeto.nombre = "Pepe";
        objeto.fechaDeNacimiento = LocalDate.of(1980,1, 9);
        listaPersonas.lista.add(objeto);

        objeto = new Persona();
        objeto.nombre = "Joaquin";
        objeto.fechaDeNacimiento = LocalDate.of(1990,7, 9);
        listaPersonas.lista.add(objeto);

    }

    @Test
    void elMasJovenTest1() {
        Persona esperado = new Persona();
        esperado.nombre = "Jesus";
        esperado.fechaDeNacimiento = LocalDate.of(2004,12, 9);

        assertEquals(esperado.nombre, listaPersonas.elMasJoven().nombre);
    }


}
