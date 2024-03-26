package org.example;

public class CafeteraRistretto extends Cafetera{

    private double capacidadMaxima;
    private double peso;
    private double cantidadActual;

    public CafeteraRistretto(double capacidadMaxima, double peso) {
        super(capacidadMaxima, peso);
    }

    @Override
    public void servirCafe() {
        if (cantidadActual > 0) {
            System.out.println("Sirviendo un café Ristretto.");
            --cantidadActual;
        }else{
            System.out.println("La cafetera de está vacía. Por favor, rellénela antes de servir café.");
        }
    }
}
