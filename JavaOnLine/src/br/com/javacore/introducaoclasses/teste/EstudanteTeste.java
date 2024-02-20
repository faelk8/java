package br.com.javacore.introducaoclasses.teste;

import br.com.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula = "1234";
        joao.idade = 20;

        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.matricula);
    }
}
