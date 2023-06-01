package com.programacion2;

import java.util.ArrayList;
import java.util.List;

public class Personas {

    List<Persona> lista = new ArrayList<Persona>();



    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public Persona elMasJoven() {
        MiIf valor = (lista) -> {
            Persona objeto = new Persona();
            long edadInicial = 200;
            // Seleccionamos el primer elemento
            for (Persona p : lista) {
                // Condición de que la edad calculada sea mayor que la edad inicial
                if (p.calcularEdad() < edadInicial) {
                    edadInicial = p.calcularEdad();
                    objeto = p;
                }
            }
            return objeto;
            
        };
        return (valor.apply(lista));

    }

}

@FunctionalInterface
interface MiIf {

    Persona apply(List<Persona> lista);

}
