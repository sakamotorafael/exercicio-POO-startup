package com.company;

public class TransfEntreContas extends Transacao {
    private Conta contaTerceiro;

    public Conta getContaTerceiro() {
        return contaTerceiro;
    }

    public TransfEntreContas(int id, Conta conta, double valor, String data, Conta contaTerceiro) {
        super(id, conta, valor, data);
        if(contaTerceiro.getId() != super.getConta().getId()) {
            this.contaTerceiro = contaTerceiro;
        }
    }
}
