package com.programacion2;

public class HexadecimalToDecimal {

    int resultado = 0;
    int exponente =0;

    public void hexadecimalToBinarioR(String elemento){
        String digitos = "0123456789ABCDEF";

        int longitudElemento = elemento.length();

        for(int i = (longitudElemento - 1); i >=0; i--){

            int valor = digitos.indexOf(elemento.charAt(i));
            resultado += valor * Math.pow(16, exponente++);
        }
    }

    public void DecimalToBinarioI(int elemento){

        while(elemento > 2){
            resultado += (elemento % 2) * Math.pow(10, exponente++);
            elemento = elemento / 2;
        } if(elemento < 2) {
            resultado = elemento * Math.pow(10, exponente);
        }

    }
}
