package com.programacion2;

import java.net.PasswordAuthentication;

public class Aproximacion {
    
    public double aproximarIterativo(double x, int iteraciones){
        double paso1 = 0.0;
        double paso2= 1.0;
        double resultado = 0.0;
        for(int k = 0; k<=iteraciones; k++){
            paso1 += Math.pow(x, k);
            if(k<iteraciones){
                paso2 *= (k + 1);
            } 
            resultado += paso1/paso2;
        }
        return resultado;
    }
}
