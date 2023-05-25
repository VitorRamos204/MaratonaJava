package academy.devdojo.javacore.Aintroducaoclasses.teste;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Subaru";
        carro01.modelo = "WRX STI";
        carro01.ano = 2022;
        System.out.println("Nome: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);
        System.out.println("--------=------------------=---------------=");
        carro02.nome = "Lexus";
        carro02.modelo = "CT200H";
        carro02.ano = 2017;
        System.out.print("Nome: " + carro02.nome + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);
    }
}
