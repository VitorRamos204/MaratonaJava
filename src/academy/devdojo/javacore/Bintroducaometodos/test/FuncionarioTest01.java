package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Vitor";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{3490.2, 5000.0, 2419.0};
        funcionario.imprimeFuncionario();
        funcionario.mediaSalarioFuncionario();
    }
}
