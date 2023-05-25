package academy.devdojo.javacore.Jmodificadorfinal.test;

import academy.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
