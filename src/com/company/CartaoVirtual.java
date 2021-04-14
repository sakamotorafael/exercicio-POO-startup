package com.company;

public class CartaoVirtual extends Cartao {
    private String dataExpiracao;

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public CartaoVirtual(String numero, int cvv, String bandeira, double limite, String vencimento, Conta conta, String dataExpiracao) {
        super(numero, cvv, bandeira, limite, vencimento, conta);
        this.dataExpiracao = dataExpiracao;
    }
}
