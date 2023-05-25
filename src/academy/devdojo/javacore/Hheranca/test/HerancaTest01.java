package academy.devdojo.javacore.Hheranca.test;

import academy.devdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-945");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa");
        pessoa.setCpf("092.111.111-21");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("032.111.111-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);
        funcionario.imprime();
    }
}
