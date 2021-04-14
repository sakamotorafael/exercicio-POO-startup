package com.company;

public class Transacao {
    private static int ultimoId;
    private int id;
    private Conta conta;
    private double valor;
    private String data;

    public int getId() {
        return id;
    }

    public Conta getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public Transacao(Conta conta, double valor, String data) {
        this.id = ++ultimoId;
        this.conta = conta;
        this.valor = valor;
        this.data = data;
    }
}
