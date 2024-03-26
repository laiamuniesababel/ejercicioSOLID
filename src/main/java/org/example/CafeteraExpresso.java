package org.example;

public class CafeteraExpresso extends Cafetera{
    private double capacidadMaxima;
    private double peso;
    private double cantidadActual;
    public CafeteraExpresso(double capacidadMaxima, double peso) {
        super(capacidadMaxima, peso);
    }

    @Override
    public void servirCafe() {
        if (cantidadActual > 0) {
            System.out.println("Sirviendo un café Expresso.");
            --cantidadActual;
        }else{
            System.out.println("La cafetera de está vacía. Por favor, rellénela antes de servir café.");
        }
    }
}
