package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 9000D;
        String mensagemDoar = "Eu vou doar 500tao pro DevDojo";
        String mensagemNaoDoar = "Ainda n tenho condicoes, mas vou ter!";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
