package com.company;

public class Cartao {
    private String numero;
    private int cvv;
    private double limite;
    private String vencimento;
    private Conta conta;
    private String bandeira;

    public String getNumero() {
        return numero;
    }

    public int getCvv() {
        return cvv;
    }

    public double getLimite() {
        return limite;
    }

    public String getVencimento() {
        return vencimento;
    }

    public Conta getConta() {
        return conta;
    }

    public String getBandeira() {
        return bandeira;
    }

    ////


    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Cartao(String numero, int cvv, String bandeira, double limite, String vencimento, Conta conta) {
        this.numero = numero;
        this.cvv = cvv;
        this.bandeira = bandeira;
        this.limite = limite;
        this.vencimento = vencimento;
        this.conta = conta;

    }
}
