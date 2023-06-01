package com.programacion2;

import java.util.List;

public class ObtenerLista {

    public int sumaListaRecursivo(List<Integer> miLista) throws MiExcepcion{
        int resultado = 0;
        if(!miLista.isEmpty()){
            int elemento = miLista.get(0);
            if(elemento < 0){
                throw new MiExcepcion();
            } else if(elemento > 0){
                miLista.remove(0);
                if(elemento % 2 == 0){
                    resultado = elemento;
                }
                resultado += sumaListaRecursivo(miLista);
            }
            System.out.println("Hola");   
        }
        return resultado;
    }


        public int sumaListaIterativa(List<Integer> miLista) throws MiExcepcion {
            int resultado = 0;
            for (int elemento : miLista) {
                if(elemento < 0){
                    throw new MiExcepcion();
                } else if(elemento > 0){
                    if (elemento % 2 == 0) {
                        resultado += elemento;
                    }
                }
            }
            return resultado;
        }
    }



    
class MiExcepcion extends Exception {

}
