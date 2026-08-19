package br.local.screematch.oo;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderso chefão";
        meuFilme.duracaoEmMinutos = 110;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 6.7;
        meuFilme.anoDeLancamento = 1970;

        System.out.println(meuFilme.nome);

    }
}
