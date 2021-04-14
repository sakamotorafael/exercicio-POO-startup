package com.company;

public class TED extends Transacao{
    private int banco;
    private String agencia;
    private String contaCorrente;
    private String nome;
    private String cpf;

    public int getBanco() {
        return banco;
    }

    public java.lang.String getAgencia() {
        return agencia;
    }

    public java.lang.String getContaCorrente() {
        return contaCorrente;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public TED(int id, Conta conta, double valor, String data, int banco, String agencia, String contaCorrente, String nome, String cpf) {
        super(id, conta, valor, data);
        this.banco = banco;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.nome = nome;
        this.cpf = cpf;
    }
}
