package com.vianna.sugarorm_sqlite;

import com.orm.SugarRecord;

public class Pessoa extends SugarRecord {

    public Pessoa(){

    };

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    String nome;
    int idade;

}
