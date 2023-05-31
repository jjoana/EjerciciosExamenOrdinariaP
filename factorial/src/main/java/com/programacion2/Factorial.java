package com.programacion2;

public class Factorial {

    public int factorialRecursivo(int n) throws MiExcepcion {
        if (n < 0) {
            throw new MiExcepcion();
        } else if (n > 1) {
            n *= factorialRecursivo(n - 1);
        }
        return n;
    }

    public int factorialIterativo(int n) throws MiExcepcion {
        if (n < 0) {
            throw new MiExcepcion();
        } else {
            int valor = 1;
            for (int i = n; i > 1; i--) {
                valor *= i;
            }
            return valor;
        }
    }

    public int factorialLambda(int n) throws MiExcepcion {
        if(n < 0){
            throw new MiExcepcion();
        } else {
            interfaz miInterfaz = (a) -> {
                int valor = 1;
                for (int i = a; i > 1; i--) {
                    valor *= i;
                }
                return valor;
            };
            return (miInterfaz.apply(n));
        }
    }

    @FunctionalInterface

    interface interfaz {
        int apply(int n);
    }
}

class MiExcepcion extends Exception {

}
