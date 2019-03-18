package Embaralhadores;

import java.util.Random;

public class PermutacaoRandomica implements Embaralhador {

    private int qtdMaximaEmbaralhamentos = 20;
    private String palavraOriginal;

    @Override
    public String embaralhar(String palavraOriginal) {
        this.palavraOriginal = palavraOriginal;
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(qtdMaximaEmbaralhamentos) + 1;
        char[] palavraEmbaralhada = palavraOriginal.toCharArray();
        int tamanhoPalavra = palavraEmbaralhada.length;

        for (int i = 0; i < numeroAleatorio; i++) {
            int posicaoA = rand.nextInt(tamanhoPalavra);
            int posicaoB = rand.nextInt(tamanhoPalavra);
            char aux = palavraEmbaralhada[posicaoA];
            palavraEmbaralhada[posicaoA] = palavraEmbaralhada[posicaoB];
            palavraEmbaralhada[posicaoB] = aux;
        }

        return String.valueOf(palavraEmbaralhada);
    }

    @Override
    public String retornarPalavraOriginal() {
        return this.palavraOriginal;
    }
}
