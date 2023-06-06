package com.programacion2;

import java.security.DrbgParameters.Reseed;
import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

    public static final Object ConversionRecursivo = null;
    public ArrayList<Integer> miLista = new ArrayList<Integer>();
    public ArrayList<Integer> decimal_a_Binario = new ArrayList<Integer>();

    private void ConversionRecursivo(int elemento) {
        int resultado = 0;
        int valor = 0;

        if (elemento >= 2) {
            resultado = elemento % 2;
            miLista.add(resultado);
            ConversionRecursivo(elemento / 2);
        } else if (elemento < 2){
            miLista.add(elemento);
            ordenaRecursivo();
        }
    }

    private void ordenaRecursivo(){

        if(!miLista.isEmpty()){
            int indice = miLista.size() - 1;
            decimal_a_Binario.add(miLista.get(indice));
            miLista.remove(indice);
            ordenaRecursivo();
        }
    }

    public void convierteaBinarioR(int elemento){
        ConversionRecursivo(elemento);
        ordenaRecursivo();
    }

    public void ConversionIterativo(int elemento){
        int resultado = 0;

        while(elemento >= 2){
            resultado = elemento % 2;
            miLista.add(resultado);
            elemento = elemento /2;
        }

        if(elemento < 2){
            miLista.add(elemento);
            int tamano = miLista.size();
            for(int i = tamano-1; i >= 0; i--){
                int valor = miLista.get(i);
                decimal_a_Binario.add(valor);
            }
        }
    }
}
