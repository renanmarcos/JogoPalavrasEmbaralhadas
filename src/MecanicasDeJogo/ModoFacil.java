package MecanicasDeJogo;

import Embaralhadores.Embaralhador;

public class ModoFacil implements MecanicaDoJogo {

    private int quantidadeErros = 0;
    private int pontuacao = 0;

    @Override
    public boolean acertouPalavra(String palavra, Embaralhador embaralhador) {
        if (palavra.equals(embaralhador.retornarPalavraOriginal())) {
            this.pontuacao++;
            return true;
        }

        this.quantidadeErros++;
        return false;
    }

    @Override
    public boolean podeTentarNovamente() {
        return this.quantidadeErros < 3;
    }

    @Override
    public int retornarPontuacao() {
        return this.pontuacao;
    }

    @Override
    public String retornarMecanicaExplicada() {
        return "\nNo modo fácil, o jogador possui 3 chances de acertar a palavra." +
                "\nCada palavra acertada vale 1 ponto.";
    }
}
