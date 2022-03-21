package br.com.dio.extiposdedados;

public class TipodeDados {

    public static void main(String[] args) {

        char nome = 'F';
        char codigo = '\u0057';
        String pessoa = "Fernanda";
        String nomeCompleto = "Fernanda Abreu";
        String dataDeNascimento = "28/07";

        int quantidadeProduto = -585956;
        final int QUANTIDADE_PRODUTO = 585858;

        byte valorBola = 127;
        short valorCarro = 32767;
        long valorIate = 5000000000L;
        float pi = 3.14F;
        double pis = 3.14D;
        // POde até colocar o l,f,e o d em minúscula no final dos números de long, float, e double, mas não é uma boa p´ratica//

        boolean maiorDeIdade = true;
        boolean menorDeIdade = false;

        System.out.println(nome);
        System.out.println(codigo);
        System.out.println(pessoa);
        System.out.println(nomeCompleto);
        System.out.println(dataDeNascimento);
        System.out.println(quantidadeProduto);
        System.out.println(QUANTIDADE_PRODUTO);
        System.out.println(valorBola);
        System.out.println(valorCarro);
        System.out.println(valorIate);
        System.out.println(pi);
        System.out.println(pis);
        System.out.println(maiorDeIdade);
        System.out.println(menorDeIdade);
        }

    }

