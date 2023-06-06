package com.programacion2;

import javax.swing.text.StyleConstants.ColorConstants;

public class BinarioToDecimal {
    long resultado = 0;
    long exponente = 0;
    long cociente = 0;
    
    public void binarioaDecimalI(long numero){
        while(numero != 0){
            cociente = numero % 10;
            resultado += cociente *(Math.pow(2, exponente++));
            numero /=10;
        }
    } 
}
