package com.example.gestaoprojetos;



import com.example.gestaoprojetos.model.Pessoa;
import com.example.gestaoprojetos.model.Projeto;

public class Main {
    public static void main(String[] args) {
        Projeto projeto1 = new Projeto("Projeto 1");
        Projeto projeto2 = new Projeto("Projeto 2");

        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");

        projeto1.adicionarMembro(pessoa1);
        projeto1.adicionarMembro(pessoa2);
        projeto2.adicionarMembro(pessoa2);

        System.out.println("Membros do " + projeto1.getNome() + ":");
        projeto1.listarMembros();

        System.out.println("Membros do " + projeto2.getNome() + ":");
        projeto2.listarMembros();

        System.out.println("Projetos de " + pessoa2.getNome() + ":");
        for (Projeto projeto : pessoa2.getProjetos()) {
            System.out.println(projeto.getNome());
        }
    }
}
