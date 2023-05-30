package com.programacion2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Division objeto = new Division();

        try {
            objeto.dividir(5, 0);
            System.out.println("Todo ha ido bien");
        } catch (MiExcepcion excepcion) {
            System.out.println("Se ha intentado dividir por numero negativo");
        } catch (ArithmeticException excepcion) {
            System.out.println("Se ha intentado dividir por cero");
        }

    }
}

class Division {

    float dividir(int a, int b) throws MiExcepcion {

        if (b < 0)
            throw new MiExcepcion();
        float resultado = a / b;
        return resultado;

    }

}

class MiExcepcion extends Exception {

}
