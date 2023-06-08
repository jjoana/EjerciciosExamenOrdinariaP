package com.programacion2;

public class Fibonacci {

    public int FibonacciR(int n) {
        int resutado;
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                resutado = FibonacciR(n - 1 ) + FibonacciR( n - 2 );
            }
        }
        return resutado;
    }

    public int FibonacciI(int n) {
        int resultado = 0;

        if (n == 0) {
            resultado = 0;
        } else if (n == 1) {
            resultado = 1;
        } else {
            int antepenultimo = 0;
            int penultimo = 1;
            for (int i = 2; i <= n; i++) {
                resultado = penultimo + antepenultimo;
                antepenultimo = penultimo;
                penultimo = resultado;
            }
        }

        return resultado;
    }

    public int FactorialLambda(int n){
        MiIF interF = (a) -> {
            int resutado;
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                resutado = FibonacciR(n - 1) + FibonacciR(n - 2);
            }
        }
        return resutado;   
        };
        return (interF.apply(n)); 
    }
}

@FunctionalInterface
interface MiIF {

    int apply(int n);

}

