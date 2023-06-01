package com.programacion2;

public class Matematicas {
    double limInferior;
    double limSuperior;

    public static double integralEXCuadrado(double limInf, double limSup, double h) throws MiExcepcion {
        double area = 0.0;
        if(limInf > limSup){
            throw new MiExcepcion();
        }
        if (limInf < limSup) {
            double valor_x = limInf;
            limInf += h;
            area = Math.exp(Math.pow(valor_x, 2)) * h + integralEXCuadrado(limInf, limSup, h);
        }
        return area;
    }

    public static double integralEXCuadradoI(double limInf, double limSup, double h) throws MiExcepcion {
        double area = 0.0;
        if(limInf < limSup){
            throw new MiExcepcion();
        }
        while (limInf < limSup) {
            double valor_x = limInf;
            limInf += h;
            area = Math.exp(Math.pow(valor_x, 2)) * h;
        }
        return area;
    }
}

class MiExcepcion extends Exception {

}
