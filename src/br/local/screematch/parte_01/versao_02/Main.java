package br.local.screematch.parte_01.versao_02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Esse á o Screen Match");
        System.out.println("FIlme: Top Gun: Maverick");

        int andDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + andDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = 9.2 + 6.3 + 3.8 / 3;
        System.out.printf("Media do filme: %.2f",  media);
        System.out.println(String.format("\nA méidia é  %.2f", media));

        String sinopse = """ 
        Filme Top Gun
        Filme de aventura com galã dos anos 80";
        Media de nota do filme %.2f
        """.formatted(media);
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) media / 2;
        System.out.println("A classificação: " + classificacao);
    }
}
