package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class OrdenacionTest {

    @Test
    void ordenacion_Test_1() {

        Persona persona;
        ArrayList<Persona> listaPersonasSinOrdenar = new ArrayList<Persona>();
        ArrayList<Persona> listaPersonasOrdenadas = new ArrayList<Persona>();

        persona = new Persona();
        persona.setNombre("Jesus");
        persona.setFechaDeNacimiento(null);
        listaPersonasSinOrdenar.add(persona);

        persona = new Persona();
        persona.setNombre("Ana");
        persona.setFechaDeNacimiento(null);
        listaPersonasSinOrdenar.add(persona);

        persona = new Persona();
        persona.setNombre("Julio");
        persona.setFechaDeNacimiento(null);
        listaPersonasSinOrdenar.add(persona);

        persona = new Persona();
        persona.setNombre("Joaquin");
        persona.setFechaDeNacimiento(null);
        listaPersonasSinOrdenar.add(persona);


        persona = new Persona();
        persona.setNombre("Ana");
        persona.setFechaDeNacimiento(null);
        listaPersonasOrdenadas.add(persona);

        persona = new Persona();
        persona.setNombre("Jesus");
        persona.setFechaDeNacimiento(null);
        listaPersonasOrdenadas.add(persona);

        persona = new Persona();
        persona.setNombre("Joaquin");
        persona.setFechaDeNacimiento(null);
        listaPersonasOrdenadas.add(persona);

        persona = new Persona();
        persona.setNombre("Julio");
        persona.setFechaDeNacimiento(null);
        listaPersonasOrdenadas.add(persona);

        Ordenacion objetoResultado = new Ordenacion(listaPersonasSinOrdenar);

        Persona[] esperado = new Persona[listaPersonasOrdenadas.size()];
        listaPersonasOrdenadas.toArray(esperado);

        Persona[] calculado = new Persona[objetoResultado.listaPersonas.size()];
        objetoResultado.listaPersonas.toArray(calculado);
        

        assertEquals(esperado, calculado);

    }
    
}