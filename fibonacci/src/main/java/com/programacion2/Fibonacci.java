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
                resutado = FibonacciR(n-1) + FibonacciR(n-2);
            }
        }
        return resutado;
    }
}
