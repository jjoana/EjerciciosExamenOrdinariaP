package com.programacion2;

public class Potencia {

    public int potenciaRecursivo(int base, int exponente){
        int resultado = base;
        if(exponente > 0){
            resultado*= potenciaRecursivo(base, exponente-1);
        } else {
            return 1;
        }
        return resultado;
    }

    public int potenciaIterativo(int base, int exponente){
        int resultado = 1;
        for(int i = exponente; i>0; i--){
            resultado *= base;
        }
        return resultado;
    }
}
