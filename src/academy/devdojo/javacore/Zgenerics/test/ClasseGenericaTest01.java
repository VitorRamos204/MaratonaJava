package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.services.CarroRentavelServices;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelServices carroRentavelServices = new CarroRentavelServices();
        Carro carro = carroRentavelServices.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carroRentavelServices.retornarCarroAlugado(carro);
    }
}
