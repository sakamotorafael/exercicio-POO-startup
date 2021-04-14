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

    public String getAgencia() {
        return agencia;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public TED( Conta conta, double valor, String data, int banco, String agencia, String contaCorrente, String nome, String cpf) {
        super(conta, valor, data);
        this.banco = banco;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.nome = nome;
        this.cpf = cpf;
    }
}
