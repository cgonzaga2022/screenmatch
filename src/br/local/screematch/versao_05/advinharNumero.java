package br.local.screematch.versao_05;

import java.util.Random;
import java.util.Scanner;

public class advinharNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tentativas = 1;
        int totalTentativas = 3;
        int numeroDigitado;
        int numeroSecreto = new Random().nextInt(3);


        while (tentativas <= totalTentativas) {
            System.out.print("Digite um numero: ");
            numeroDigitado =  input.nextInt();

            if (numeroDigitado == numeroSecreto) {
                break;
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("Numero secreto é maior");
            } else{
                System.out.println("Númeor sercreto é menor");
            }

            tentativas++;
        }

        if (tentativas > totalTentativas){
            System.out.println("Você não encontrou o número!");
        } else {
            System.out.println("Você econtrou o núemro na " + tentativas + " tentativa(s)!");
        }

    }
}
