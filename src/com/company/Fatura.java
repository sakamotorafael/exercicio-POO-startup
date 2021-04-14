package com.company;

public class Fatura {
    private double valor;
    private String dataFechamento;
    private Cartao cartao;

    public double getValor() {
        return valor;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setValor(double valor) {
        if(valor <= cartao.getLimite()) {
            this.valor = valor;
        }
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Fatura(double valor, String dataFechamento, Cartao cartao) {
        if(valor <= cartao.getLimite()) {
            this.valor = valor;
        }
        this.valor = valor;
        this.dataFechamento = dataFechamento;
        this.cartao = cartao;
    }
}
