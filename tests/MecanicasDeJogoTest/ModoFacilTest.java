package MecanicasDeJogoTest;

import Embaralhadores.InversaoPalavra;
import MecanicasDeJogo.ModoFacil;
import junit.framework.TestCase;

public class ModoFacilTest extends TestCase {

    public void testeErrouPalavra() {
        ModoFacil modoJogo = new ModoFacil();
        InversaoPalavra embaralhador = new InversaoPalavra();
        embaralhador.embaralhar("Gelatinoso");

        assertFalse(modoJogo.acertouPalavra("arroz", embaralhador));
        assertTrue(modoJogo.podeTentarNovamente());
        assertEquals(0, modoJogo.retornarPontuacao());

        embaralhador.embaralhar("Sistemas");
        assertFalse(modoJogo.acertouPalavra("sistemas", embaralhador));
        assertTrue(modoJogo.podeTentarNovamente());
        assertEquals(0, modoJogo.retornarPontuacao());

        embaralhador.embaralhar("analise");
        assertFalse(modoJogo.acertouPalavra("sistemas", embaralhador));
        assertFalse(modoJogo.podeTentarNovamente());
        assertEquals(0, modoJogo.retornarPontuacao());
    }

    public void testeAcertouPalavra() {
        ModoFacil modoJogo = new ModoFacil();
        InversaoPalavra embaralhador = new InversaoPalavra();
        embaralhador.embaralhar("Gelatinoso");

        assertTrue(modoJogo.acertouPalavra("Gelatinoso", embaralhador));
        assertTrue(modoJogo.podeTentarNovamente());
        assertEquals(1, modoJogo.retornarPontuacao());

        embaralhador.embaralhar("Informática");
        assertTrue(modoJogo.acertouPalavra("Informática", embaralhador));
        assertTrue(modoJogo.podeTentarNovamente());
        assertEquals(2, modoJogo.retornarPontuacao());

        testeErrouPalavra();
    }
}
