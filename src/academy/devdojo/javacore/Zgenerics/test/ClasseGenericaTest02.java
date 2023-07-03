package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.services.BarcoRentavelServices;
import academy.devdojo.javacore.Zgenerics.services.CarroRentavelServices;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelServices barcoRentavelServices = new BarcoRentavelServices();
        Barco barco = barcoRentavelServices.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelServices.retornarBarcoAlugado(barco);
    }
}
