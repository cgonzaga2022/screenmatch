package br.local.screematch.parte_01.versao_05;

import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000;
        double valor;
        int opcao;

        String mensagem = """
                Dados iniciais de cliente:
                
                Nome:           Carlos Gonzaga
                Tipo conta:     Conrrente
                Saldo inicial:  %.2f
                """.formatted(saldo);
        System.out.println(mensagem);
        do {
            exibirMenu();

            System.out.print("Digite a opção deseja: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    exibirSaldo(saldo);
                    break;
                case 2:
                    valor = montarMensagem(input);
                    saldo += valor;
                    exibirSaldo(saldo);
                    break;
                case 3:
                    valor = montarMensagem(input);
                    if (valor <= saldo ) {
                        saldo -=valor;
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4:
                    opcao = 4;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        } while ( opcao != 4);

     }

    private static void exibirSaldo(double saldo) {
        System.out.println("Saldo Atualzado: " + saldo);
    }

    private static double montarMensagem(Scanner input) {
        System.out.print("Digite o valor : ");
        return input.nextDouble();
    }

    private static void exibirMenu() {
        System.out.println("""
                
                Observações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair       
                """);
    }

}

