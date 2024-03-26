package org.example;

import lombok.Data;

@Data
public abstract class Cafetera {

    private double capacidadMaxima;
    private double peso;
    private double cantidadActual;

    public Cafetera(double capacidadMaxima, double peso) {
        this.capacidadMaxima = capacidadMaxima;
        this.peso = peso;
        this.cantidadActual = 0.0;
    }

    public void rellenarCafetera(double cantidad) {
        this.cantidadActual = this.cantidadActual + cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0.0;
    }

    public void servirCafe() {
        --cantidadActual;
    }

    //abstract void servirCafeEspecial();

}