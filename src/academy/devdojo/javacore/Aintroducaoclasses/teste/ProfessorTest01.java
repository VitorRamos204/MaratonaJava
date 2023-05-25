package academy.devdojo.javacore.Aintroducaoclasses.teste;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.idade = 50;
        professor.sexo = 'M';
        System.out.print("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
