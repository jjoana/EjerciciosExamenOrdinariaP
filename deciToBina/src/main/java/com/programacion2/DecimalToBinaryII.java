package com.programacion2;

public class DecimalToBinaryII {

    double resultado = 0;
    int exponente = 0;

    public void ConversionRecursivo(int elemento) {
        if (elemento >= 2) {
            resultado += (elemento % 2) * Math.pow(10, exponente++);
            ConversionRecursivo(elemento / 2);
        } else if (elemento < 2) {
            resultado += (elemento) * Math.pow(10, exponente);
        }
    }

    public void ConversionIterativo(int elemento) {
        while (elemento >= 2) {
            resultado += (elemento % 2) * (Math.pow(10, exponente++));
            elemento = elemento / 2;
        }
        
        if (elemento < 2) {
            resultado += (elemento) * (Math.pow(10, exponente));
        }
    }
}
