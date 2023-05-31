package com.programacion2;

public class Potencia {

    public int potenciaRecursivo(int base, int exponente)throws MiExcepcion{
        int resultado = base;
        if(exponente < 0){
            throw new MiExcepcion();
        } else  if (exponente > 0){
            resultado*= potenciaRecursivo(base, exponente-1);
        } else { // caso base recurisvo
            resultado =1;
        }
        return resultado;
    }

    public int potenciaIterativo(int base, int exponente) throws MiExcepcion{
        int resultado = 1;
        if(exponente <0){
            throw new MiExcepcion();
        } else {
            for(int i = exponente; i>0; i--){
                resultado *= base;
            }
            return resultado;
        }
    }
}

class MiExcepcion extends Exception {
    
} 
