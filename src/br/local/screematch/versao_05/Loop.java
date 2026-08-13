package br.local.screematch.versao_05;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i =0; i<3; i++){
            System.out.print("Diga a sua avaliação: ");
            nota = input.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.print("Média de avaliação: " + mediaAvaliacao/3);

    }
}
