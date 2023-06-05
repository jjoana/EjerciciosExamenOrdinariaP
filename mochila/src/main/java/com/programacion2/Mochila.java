package com.programacion2;

import java.util.List;

public class Mochila {

    public static int cargaMochilaIterativo(int capacidadMaxima, int[] precios, int[] pesos) {

        int[][] matriz = new int[precios.length + 1][capacidadMaxima + 1];
        int numeroObjetos = precios.length;

        // Inicializamos la tabla dinamica
        for (int fila = 0; fila <= numeroObjetos; fila++) {
            matriz[fila][0] = 0;
        }

        for (int columna = 0; columna <= capacidadMaxima; columna++) {
            matriz[0][columna] = 0;
        }



        // Vamos cargando los datos celda a celda
        for (int fila = 1; fila <= numeroObjetos; fila++) {
            for (int columna = 1; columna <= capacidadMaxima; columna++) {
                if (pesos[fila - 1] <= columna) {
                    matriz[fila][columna] = Math.max(precios[fila - 1] + matriz[fila - 1][columna - pesos[fila - 1]], matriz[fila - 1][columna]);
                } else {
                    matriz[fila][columna] = matriz[fila - 1][columna];
                }
            }
        }

        return 1;

    }

}
