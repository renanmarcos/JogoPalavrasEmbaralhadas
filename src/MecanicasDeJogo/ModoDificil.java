package MecanicasDeJogo;

import Embaralhadores.Embaralhador;

public class ModoDificil implements MecanicaDoJogo {

    private int pontuacao = 0;
    private boolean podeTentarNovamente = true;

    @Override
    public boolean acertouPalavra(String palavra, Embaralhador embaralhador) {
        if (palavra.equals(embaralhador.retornarPalavraOriginal())) {
            this.pontuacao++;
            return true;
        }

        this.podeTentarNovamente = false;
        return false;
    }

    @Override
    public boolean podeTentarNovamente() {
        return this.podeTentarNovamente;
    }

    @Override
    public int retornarPontuacao() {
        return this.pontuacao;
    }

    @Override
    public String retornarMecanicaExplicada() {
        return  "\nNo modo difícil, se o jogador errar a palavra ele já perde a chance de continuar." +
                "\nCada palavra acertada vale 1 ponto.";
    }
}
