package academy.devdojo.javacore.Zgenerics.services;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando carro disponivel....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+ t);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornarCarroAlugado(T t) {
        System.out.println("Devolvendo objeto: "+ t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
