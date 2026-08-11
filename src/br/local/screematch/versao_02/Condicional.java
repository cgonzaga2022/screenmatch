package br.local.screematch.versao_02;

public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 1986;
        boolean incluindoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançameno que os clientes estão curtindo! ");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluindoNoPlano  || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
