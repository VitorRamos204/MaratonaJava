package academy.devdojo.javacore.Lclassesabstratas.teste;

import academy.devdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
