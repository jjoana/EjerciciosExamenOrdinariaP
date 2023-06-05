package com.programacion2;

import java.util.ArrayList;
import java.util.TreeMap;

public class MetodoCesar {

    TreeMap<Integer, Character> diccionario = new TreeMap<Integer, Character>();
    ArrayList<Character> original = new ArrayList<Character>();
    ArrayList<Character> transformadoCesar = new ArrayList<Character>();

    public MetodoCesar() {

        // Cargar las letras del alfabeto en el TreeMap
        char currentLetter = 'A';
        for (int i = 1; i <= 26; i++) {
            diccionario.put(i, currentLetter);
            currentLetter++;
        }

    }

    public ArrayList<Character> leerCadena (String texto_Original){

        ArrayList<Character> miArray = new ArrayList<Character>();

        for(int i = 0; i < texto_Original.length(); i++){
            miArray.set(i,texto_Original.charAt(i));
        }
        return miArray;
    }

}
