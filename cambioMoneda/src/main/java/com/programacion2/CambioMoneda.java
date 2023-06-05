package com.programacion2;

import java.lang.module.ResolutionException;
import java.util.Collections;
import java.util.List;
import javax.management.monitor.MonitorSettingException;

public class CambioMoneda {

    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas) {
        int resultado = 0;
        for (int i = 0; i < sistemaMonedas.size(); i++) {
            while (cambio > 0) {
                cambio -= sistemaMonedas.get(i);
                resultado++;
            }
            if (cambio != 0) {
                cambio += sistemaMonedas.get(i);
                resultado--;
            } else {

            }
        }
        return resultado;
    }

    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas) {
        int[] resultado = new int[1];

        cambioRecursivo(cambio, 0, sistemaMonedas, resultado);
        return resultado[0];

    }

    private static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {

        if (cambio <= 0) {
            return;
        } else {
            int moneda = sistemaMonedas.get(i);
            if (cambio >= moneda) {
                resultado[0] += cambio / sistemaMonedas.get(i);
                cambio = cambio % sistemaMonedas.get(i);
                cambioRecursivo(cambio, ++i, sistemaMonedas, resultado);
            } else {
                cambioRecursivo(cambio, ++i, sistemaMonedas, resultado);
            }

        }
    }

    public int cambioLambda(int cambiolambda, List<Integer> sistemaMonedaslambda) {
        
        MiInter interF = (cambio, sistemaMonedas) -> {
            int resultado = 0;
            for (int i = 0; i < sistemaMonedas.size(); i++) {
                while (cambio > 0) {
                    cambio -= sistemaMonedas.get(i);
                    resultado++;
                }
                if (cambio != 0) {
                    cambio += sistemaMonedas.get(i);
                    resultado--;
                } else {
                }
            }
            return resultado;
        };
        return (interF.apply(cambiolambda, sistemaMonedaslambda));
    }
}

@FunctionalInterface
interface MiInter {

    int apply(int cambio, List<Integer> sistemnaMonedas);
}
