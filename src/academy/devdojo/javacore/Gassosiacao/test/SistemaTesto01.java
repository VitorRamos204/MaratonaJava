package academy.devdojo.javacore.Gassosiacao.test;

import academy.devdojo.javacore.Gassosiacao.dominio.Aluno;
import academy.devdojo.javacore.Gassosiacao.dominio.Local;
import academy.devdojo.javacore.Gassosiacao.dominio.Professor;
import academy.devdojo.javacore.Gassosiacao.dominio.Seminario;

public class SistemaTesto01 {
    public static void main(String[] args) {
        Local local = new Local("Holanda");
        Aluno aluno = new Aluno("Vitor", 18);
        Professor professor = new Professor("William", "Java");
        Aluno[] alunoSeminario = {aluno};
        Seminario seminario = new Seminario("Maratona Java", alunoSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();

    }
}
