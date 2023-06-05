package com.programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personas {

    List<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public Persona elMasJoven() {

        MiInterf valor = (personas) -> {

            Persona objeto = new Persona();
            long edadInicial = 150;
            // Seleccionamos el primer elemento de la lista
            for (Persona seleccion : personas.lista) {
                try {
                    if (seleccion.calcularEdad() < edadInicial) {
                        edadInicial = seleccion.calcularEdad();
                        objeto = seleccion;
                    }
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
            return objeto;
        };
        return (valor.apply(this));
    }

    public long calcularSumaEdades() {
        MiInterf2 valor = (personas) -> {
            int resultado = 0;
            for (Persona seleccion : lista) {
                try {
                    resultado += seleccion.calcularEdad();
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
            return resultado;
        };
        return (valor.apply(this));
    }

    public long calcularEdadMinima() {
        long edadInicial = 200;
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            Persona p = lista.get(i);
            try {
                if (p.calcularEdad() < edadInicial) {
                    edadInicial = p.calcularEdad();
                }
            } catch (MiExcepcion e) {
                System.out.println("Ha ocurrido un error");
            }
        }
        return edadInicial;
    }


    public double calcularMediaEdad() {
            double resultado = 0;
            try{
                for (Persona p : lista) {
                    resultado += p.calcularEdad();
                }
            } catch (MiExcepcion e) {
                System.out.println("Ha ocurrido un error");
            }
            return resultado/lista.size();
         }
    }
    
@FunctionalInterface
interface MiInterf {

    Persona apply(Personas personas);
}


@FunctionalInterface
interface MiInterf2 {

    long apply(Personas personas);
}
