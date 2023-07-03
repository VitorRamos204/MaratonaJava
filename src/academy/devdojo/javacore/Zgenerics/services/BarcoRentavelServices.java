package academy.devdojo.javacore.Zgenerics.services;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelServices {
    private List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel....");
        Barco barco = barcos.remove(0);
        System.out.println("Alugando barco: "+ barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcos);
        return barco;
    }
    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco: "+ barco);
        barcos.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcos);
    }
}
