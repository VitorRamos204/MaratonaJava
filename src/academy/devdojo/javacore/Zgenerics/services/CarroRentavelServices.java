package academy.devdojo.javacore.Zgenerics.services;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelServices {
    private List<Carro> carros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponivel....");
        Carro carro = carros.remove(0);
        System.out.println("Alugando carro: "+ carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carros);
        return carro;
    }
    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro: "+ carro);
        carros.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carros);
    }
}
