package br.local.screematch.parte_01.versao_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String filme = "";
        int anoDoLancamento = 0;
        double avaliacao = 0.0;

        try {
            System.out.print("Digite seu filme favorito: ");
            filme = input.nextLine();

            System.out.print("Digite o ano de lancamento: ");
            anoDoLancamento = input.nextInt();

            System.out.print("Diga a sua avaliação para o fime: ");
            avaliacao = input.nextDouble();


        } catch (InputMismatchException e) {
            System.out.println("Erro: verificar a opçãp digitada!");
        } finally {
            System.out.println(filme);
            System.out.println("O ano de lancamento: " + anoDoLancamento);
            System.out.println("A nota da avaliação do filme: " + avaliacao);
        }


    }
}
