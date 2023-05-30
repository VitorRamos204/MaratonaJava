package academy.devdojo.javacore.Npolimorfismo.teste;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 45\" 2020", 4000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        CalculadoraImposto.calcularImposto(tv);


    }
}
