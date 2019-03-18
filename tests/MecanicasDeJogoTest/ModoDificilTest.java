package MecanicasDeJogoTest;

import Embaralhadores.PermutacaoRandomica;
import MecanicasDeJogo.ModoDificil;
import junit.framework.TestCase;

public class ModoDificilTest extends TestCase {

    public void testeErrouPalavra() {
        ModoDificil modoJogo = new ModoDificil();
        PermutacaoRandomica embaralhador = new PermutacaoRandomica();
        embaralhador.embaralhar("Gelatinoso");

        assertFalse(modoJogo.acertouPalavra("arroz", embaralhador));
        assertFalse(modoJogo.podeTentarNovamente());
        assertEquals(0, modoJogo.retornarPontuacao());
    }

    public void testeAcertouPalavra() {
        ModoDificil modoJogo = new ModoDificil();
        PermutacaoRandomica embaralhador = new PermutacaoRandomica();
        embaralhador.embaralhar("Gelatinoso");

        assertTrue(modoJogo.acertouPalavra("Gelatinoso", embaralhador));
        assertTrue(modoJogo.podeTentarNovamente());
        assertEquals(1, modoJogo.retornarPontuacao());

        embaralhador.embaralhar("Informática");
        assertFalse(modoJogo.acertouPalavra("Gelatinoso", embaralhador));
        assertFalse(modoJogo.podeTentarNovamente());
        assertEquals(1, modoJogo.retornarPontuacao());
    }
}
