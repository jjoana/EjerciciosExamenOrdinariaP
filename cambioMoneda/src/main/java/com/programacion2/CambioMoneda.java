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

    public static int cambioIterativoI(int cambio, List<Integer> sistemaMonedas) {
        int resultado = 0;
        for (int i = 0; i < sistemaMonedas.get(i); i++) {
            if (sistemaMonedas.get(i) <= cambio) {
                resultado += (cambio / sistemaMonedas.get(i));
                cambio = (cambio % sistemaMonedas.get(i));
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

    public static int cambioRecursivo2(int cambio, List<Integer> sistemaMonedas) {
        int[] resultado = new int[1];

        cambioRecursivo2(cambio, 0, sistemaMonedas, resultado);
        return resultado[0];
    }

    private static void cambioRecursivo2(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {

        if (cambio >= sistemaMonedas.get(i)) {
            resultado[0]++;
            cambio -= sistemaMonedas.get(i);
            cambioRecursivo2(cambio, i, sistemaMonedas, resultado);
        } else if (cambio < sistemaMonedas.get(i) && cambio != 0) {
            cambioRecursivo2(cambio, ++i, sistemaMonedas, resultado);
        } else if (cambio == 0) {
        }
    }

    public static int cambioLambda(int cambioLambda, List<Integer> sistemaMonedasLambda) {

        MiInterfaz interF = (cambio, sistemaMonedas) -> {
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

        // Ordenamos de menor a mayor )1,2,3,4,5,6)
        // Collections.sort(sistemaMonedasLambda);

        // Ordenamos de mayor a menor (6,5,4,3,2,1)
        Collections.sort(sistemaMonedasLambda, Collections.reverseOrder());
        return interF.apply(cambioLambda, sistemaMonedasLambda);
    }
}

@FunctionalInterface
interface MiInterfaz {

    int apply(int cambio, List<Integer> sistemaMonedas);

}
