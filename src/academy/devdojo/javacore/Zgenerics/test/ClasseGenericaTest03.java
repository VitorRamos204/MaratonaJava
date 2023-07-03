package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.services.BarcoRentavelServices;
import academy.devdojo.javacore.Zgenerics.services.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalService = new RentalService<>(carros);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro...");
        rentalService.retornarCarroAlugado(carro);

    }
}
