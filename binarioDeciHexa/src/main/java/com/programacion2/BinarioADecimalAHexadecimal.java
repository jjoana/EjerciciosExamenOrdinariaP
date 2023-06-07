package com.programacion2;

public class BinarioADecimalAHexadecimal {
    long resultado = 0;
    long exponente = 0;
    long resto = 0;
       
    public void binarioaDecimalI(long numero){
        while(numero != 0){
            resto = numero % 10;
            resultado += resto *(Math.pow(2, exponente++));
            numero /=10;
        }
    }

    public void decimalHexadecimal(long elemento){
        while (elemento >= 2) {
            resultado += (elemento % 2) * (Math.pow(10, exponente++));
            elemento = elemento / 2;
        }
        if (elemento < 2) {
            resultado += (long) (elemento * Math.pow(10, exponente));
        }
    }
    
}
