package com.company;

public class Pix extends Transacao {
    private String pix;

    public String getPix() {
        return pix;
    }

    public Pix(int id, Conta conta, double valor, String data, String pix) {
        super(id, conta, valor, data);
        this.pix = pix;
    }
}
