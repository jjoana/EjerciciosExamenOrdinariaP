package com.programacion2;

import javax.swing.text.StyleConstants.ColorConstants;

public class BinarioToDecimal {
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
}
