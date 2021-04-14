package com.company;

public class TED extends Transacao{
    private ContaDestino contaDestino;

    public TED(Conta conta, double valor, String data, ContaDestino contaDestino) {
        super(conta, valor, data);
        this.contaDestino = contaDestino;
    }

    public ContaDestino getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaDestino contaDestino) {
        this.contaDestino = contaDestino;
    }
}
