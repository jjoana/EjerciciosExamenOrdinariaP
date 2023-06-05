package com.programacion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion {

    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public Ordenacion(ArrayList<Persona> lista){

        listaPersonas = lista;

    } 

    public ArrayList<Integer> ordenaListaEnteros (ArrayList<Integer> lista){

        //Ordena la lista que recible
        Collections.sort(lista);
        return lista;

    }


    public ArrayList<Persona> ordenaListaPersonas (ArrayList<Persona> lista){

        //Ordena la lista que recible
        Collections.sort(lista);
        return lista;

    }

    
}




