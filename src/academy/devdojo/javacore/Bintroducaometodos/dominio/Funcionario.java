package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeFuncionario() {
        System.out.print("Nome: " + this.nome + " Idade: " + this.idade);
        for (double salario: salarios) {
            System.out.print(" Salario: " + salario);
        }
    }

    public void mediaSalarioFuncionario() {
        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial: " + media);
    }

}
