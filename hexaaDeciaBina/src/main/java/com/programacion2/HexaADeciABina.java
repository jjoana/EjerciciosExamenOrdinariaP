package com.programacion2;

public class HexaADeciABina {

    long resultado = 0;
    int exponente = 0;

    public void hexadecimalToBinarioI(String elemento) {
        String digitos = "0123456789ABCDEF";

        int longitudElemento = elemento.length();

        for (int i = (longitudElemento - 1); i >= 0; i--) {

            int valor = digitos.indexOf(elemento.charAt(i));
            resultado += valor * Math.pow(16, exponente++);
        }
    }

    public void DecimalToBinarioI(long elemento) {

        while (elemento >= 2) {
            resultado += (elemento % 2) * (Math.pow(10, exponente++));
            elemento = elemento / 2;
        }
        if (elemento < 2) {
            resultado += (long) (elemento * Math.pow(10, exponente));
        }
    }

    public void hexadecimalToBinarioR(String elemento) {
        String digitos = "0123456789ABCDEF";

        int longitudElemento = elemento.length();

        if(longitudElemento > 0){
            int valor = digitos.indexOf(elemento.charAt(0));
            resultado += valor * Math.pow(16, exponente++);
            String nuevo_elemento = elemento.substring(1);
            System.out.println("Hola");
            hexadecimalToBinarioR(nuevo_elemento);

        }
    }

}
