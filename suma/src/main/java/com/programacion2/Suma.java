package com.programacion2;

public class Suma {

    public int sumaNumeroR(int n) throws MiExcepcion {
        if(n < 0){
            throw new MiExcepcion();
        } else if (n > 0) {
            n += sumaNumeroR(n - 1);
        }
        return n;
    }

    public int sumaNumeroI(int n) throws MiExcepcion {
        if (n < 0) {
            throw new MiExcepcion();
        } else {
            int valor = 0;
            for (int i = n; i > 0; i--) {
                valor += i;
            }
            return valor;
        }
    }

    public int sumaNumeroLambda(int n) throws MiExcepcion{
        if(n < 0){
            throw new MiExcepcion();
        } else {
            MiIF interF = (a) -> {
                int valor = 0;
                for (int i = a; i > 0; i--) {
                    valor += i;
                }
                return valor;
            };
            return (interF.apply(n));
        }

    }
}

@FunctionalInterface
interface MiIF {

    int apply(int n);

}

class MiExcepcion extends Exception {

}