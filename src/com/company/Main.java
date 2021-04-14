package com.company;

public class Main {

    public static void main (String[] args) {
        //usuario:
        String nome = "Rafael";
        String cpf = "123.456.789-00";
        String tel = "(11) 98765-4321";
        String email = "rafael@gmail.com";
        int score = 500;

        //endereco:
        String rua = "Rua dos bobos";
        int numeroCasa = 0;
        String bairro = "Centro";
        String cidade = "Rio de Janeiro";
        String estado = "RJ";
        String cep = "12.345-678";

        //cartao:
        String numeroCartao = "1234.5678.9123.4567";
        int cvv = 123;
        String bandeira = "Visa";
        double limite = 2500.5;
        String venc = "09/2027";

        //fatura:
        double valorFatura = 1234.9;
        String dataFechamento = "22/05/2021";


        Endereco endereco1 = new Endereco(rua, numeroCasa, bairro, cidade, estado, cep);

        Usuario user1 = new Usuario(nome, cpf, tel, email, score, endereco1);

        Conta conta1 = new Conta(email, user1);

        Cartao cartao1 = new Cartao(numeroCartao, cvv, bandeira, limite, venc, conta1);

        Fatura fatura1 = new Fatura(valorFatura, dataFechamento, cartao1);

        System.out.println(fatura1.getCartao().getLimite());


    }
}
