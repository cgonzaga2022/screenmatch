package br.local.screematch.parte_01.versao_05;

import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = input.nextDouble();
            if (nota != -1) {
                mediaAvaliacao = mediaAvaliacao + nota;
                totalDeNotas++;
            }

        }

        if (totalDeNotas != 0) {
            System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
        } else {
            System.out.println("Nenhum nota foi encontrada.");
        }
    }
}
