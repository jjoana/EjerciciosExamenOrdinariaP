package com.programacion2;

import java.util.ArrayList;
import java.util.List;

public class SumaElementos {

    public int sumaListaRecursivo(List<Integer> miLista) {
        int resultado = 0;
        if (!miLista.isEmpty()) {
            resultado = miLista.get(0);
            miLista.remove(0);
            resultado += sumaListaRecursivo(miLista);
        }
        return resultado;
    }

    public int sumaListaIterativo(List<Integer> miLista) {
        int resultado = 0;
        miLista.size();
        for (int i = miLista.size() - 1; i >= 0; i--) {
            resultado += miLista.get(i);
        }
        return resultado;
    }

    public int sumaListaLambda(List<Integer> miLista) {

        MiInterfaz interF = (a) -> {
            int resultado = 0;
            if (!miLista.isEmpty()) {
                resultado = miLista.get(0);
                miLista.remove(0);
                resultado += sumaListaRecursivo(miLista);
            }
            return resultado;
        };
        return interF.apply(miLista);


    }

    @FunctionalInterface
    interface MiInterfaz {

        int apply(List<Integer> miLista);

    }
}
