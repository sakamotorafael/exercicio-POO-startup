package com.company;

public class Conta {
    private static int ultimoId;
    private int id;
    private double saldo;
    private String pix;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public double getValor() {
        return saldo;
    }

    public String getPix() {
        return pix;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    ////


    public void setValor(double valor) {
        this.saldo = valor;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Conta(String pix, Usuario usuario) {
        this.id = ++ultimoId;
        this.pix = pix;
        this.usuario = usuario;
    }
}
