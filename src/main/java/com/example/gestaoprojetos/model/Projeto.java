package com.example.gestaoprojetos.model;


import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Pessoa> membros;

    public Projeto(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public void adicionarMembro(Pessoa pessoa) {
        if (!membros.contains(pessoa)) {
            membros.add(pessoa);
            pessoa.adicionarProjeto(this);
        }
    }

    public void listarMembros() {
        for (Pessoa pessoa : membros) {
            System.out.println(pessoa.getNome());
        }
    }
}
