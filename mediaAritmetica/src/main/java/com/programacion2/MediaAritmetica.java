package com.programacion2;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

public class MediaAritmetica {

    List<Double> lista = new ArrayList<Double>();

    public double mediaAritmeticaR(int tamano, List<Double> miLista) {
        double valor = 0;

        if (!miLista.isEmpty()) {
            valor = miLista.get(0) / tamano;
            miLista.remove(0);
            if (tamano > 1) {
                valor += mediaAritmeticaR(tamano, miLista);
            }
        }
        return valor;
    }

    public float mediaAritmeticaIterativa(List<Double> lista2, int tamano) {
        float valor = 0f;
        for (int i = lista2.size() - 1; i >= 0; i--) {
            valor += lista2.get(i) / tamano;   
        }
        return valor;
    }

    private double desviacionTipicaR(List<Double> miLista, int tamano, double media) {
        double resultado = 0;
        double valor = 0;
        if (!miLista.isEmpty()) {
            valor = miLista.get(0);
            miLista.remove(0);
            resultado += Math.pow((valor - media), 2) + desviacionTipicaR(miLista, tamano, media);
        }
        return resultado;
    }


    public double desviacionTipicaR(List<Double> miLista) {

        int tamano = miLista.size();
        double media = mediaAritmeticaR(tamano, miLista);

        double resultado = this.desviacionTipicaR(miLista, tamano, media);
        return Math.sqrt(resultado/tamano);
    }




    public double desviacionTipicaI(List<Double> miLista, int tamano, float media) {
        double resultado = 0;
        for (int i = 0; i < tamano; i++) {
            double valor = miLista.get(i);
            resultado += Math.pow((valor - media), 2);
        }
        resultado = Math.sqrt(resultado/tamano);
        return resultado;
    }

}
