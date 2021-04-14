package com.company;

public class Pix extends Transacao {
    private String pix;

    public String getPix() {
        return pix;
    }

    public Pix(Conta conta, double valor, String data, String pix) {
        super(conta, valor, data);
        if(pix != conta.getPix()) {
            this.pix = pix;
        }
    }
}
