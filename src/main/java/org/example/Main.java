package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de cafetera
        CafeteraExpresso espresso = new CafeteraExpresso(10,10);
        CafeteraRistretto ristretto = new CafeteraRistretto(8,8);
        CafeteraFiltro filtro = new CafeteraFiltro(15,15);

        // Rellenar las cafeteras
        espresso.rellenarCafetera(5);
        ristretto.rellenarCafetera(6);
        filtro.rellenarCafetera(10);

        // Servir café de cada cafetera
        espresso.servirCafe();
        ristretto.servirCafe();
        filtro.servirCafe();

        MolinoTipo1 molino1 = new MolinoTipo1();
        MolinoTipo2 molino2 = new MolinoTipo2();

        CafeteraMolinillo molinillo1 = new CafeteraMolinillo(12,12,molino1);
        CafeteraMolinillo molinillo2 = new CafeteraMolinillo(12,12,molino2);

        molinillo1.rellenarCafetera(8);
        molinillo2.rellenarCafetera(8);

        molinillo1.servirCafe();
        molinillo2.servirCafe();
    }
}