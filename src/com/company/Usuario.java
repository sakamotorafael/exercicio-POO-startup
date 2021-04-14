package com.company;

public class Usuario {
    private static int ultimoId;
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int score;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getScore() {
        return score;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    ////

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(int score) {
        if(score >= 0 && score <= 1000) {
            this.score = score;
        }
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario(String nome, String cpf, String telefone, String email, int score, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.score = score;
        this.endereco = endereco;
        this.id = ++ultimoId;
    }
}
