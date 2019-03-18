package MecanicasDeJogo;

import Embaralhadores.Embaralhador;

public interface MecanicaDoJogo {
    public boolean acertouPalavra(String palavra, Embaralhador embaralhador);
    public boolean podeTentarNovamente();
    public int retornarPontuacao();
    public String retornarMecanicaExplicada();
}
