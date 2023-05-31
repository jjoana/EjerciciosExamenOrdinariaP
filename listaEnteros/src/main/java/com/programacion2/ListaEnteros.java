package com.programacion2;

import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {
    List<Integer> listaInicial = new ArrayList<Integer>();
    List<Integer> listaPares = new ArrayList<Integer>();
    
    public ArrayList<Integer> ListaParesIterativo(){
        for(int i = 1; i<= listaInicial.size(); i++){
            if(i % 2 == 0){
                listaPares.add(listaInicial.get(i));
            }

        }
        return (ArrayList<Integer>) listaPares;
    }

    public int SumaListaParesI(List<Integer> miLista){
        int resultado = 0;
        for(int i = listaPares.size() -1; i >=0; i--){
            resultado += listaPares.get(i) -1;
        }
        return resultado;
    }

    public int SumaListaParesR(List<Integer> miLista) {
        return sumaRecursiva(miLista, miLista.size() - 1);
    }
    
    private int sumaRecursiva(List<Integer> miLista, int indice) {
        if (indice < 0) {
            return 0;
        } else {
            int elementoActual = miLista.get(indice);
            int sumaRestante = sumaRecursiva(miLista, indice - 1);
            if (elementoActual % 2 == 0) {
                return elementoActual + sumaRestante;
            } else {
                return sumaRestante;
            }
        }
    }   
}
