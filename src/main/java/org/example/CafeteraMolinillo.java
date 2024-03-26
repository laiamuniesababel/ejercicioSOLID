package org.example;

public class CafeteraMolinillo extends Cafetera{
    private double capacidadMaxima;
    private double peso;
    private double cantidadActual;
    private Molino molino;

    public CafeteraMolinillo(double capacidadMaxima, double peso, Molino molino) {
        super(capacidadMaxima, peso);
        this.molino = molino;
    }

    @Override
    public void servirCafe() {
        if (cantidadActual > 0) {
            System.out.println("Sirviendo un café de molinillo.");
            --cantidadActual;
            molino.molerCafe();
        }else{
            System.out.println("La cafetera de está vacía. Por favor, rellénela antes de servir café.");
        }
    }
}
