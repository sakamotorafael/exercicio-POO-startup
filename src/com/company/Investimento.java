package com.company;

public class Investimento {
    private double valor;
    private Conta conta;
    private String modalidade;
    private double rendimento;

    public double getValor() {
        return valor;
    }

    public Conta getConta() {
        return conta;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setValor(double valor) {
        if(valor < conta.getValor()) {
            this.valor = valor;
        }
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public Investimento(double valor, Conta conta, String modalidade, double rendimento) {
        if(valor < conta.getValor()) {
            this.valor = valor;
        }
        this.conta = conta;
        this.modalidade = modalidade;
        this.rendimento = rendimento;
    }
}
