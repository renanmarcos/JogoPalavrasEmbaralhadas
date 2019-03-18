package EmbaralhadoresTest;

import Embaralhadores.InversaoPalavra;
import junit.framework.TestCase;

public class InversaoPalavraTest extends TestCase {

    public void testePossivelDesvendar() {
        InversaoPalavra embaralhador = new InversaoPalavra();
        String palavraOriginal = "Arroz";
        StringBuilder palavraEmbaralhada = new StringBuilder(embaralhador.embaralhar(palavraOriginal));
        boolean contemTodosOsCaracteres = false;

        for (int i = 0; i < palavraEmbaralhada.length(); i++) {
            char caractere = palavraEmbaralhada.charAt(i);
            contemTodosOsCaracteres = palavraOriginal.contains(Character.toString(caractere));
        }

        assertEquals(palavraOriginal, embaralhador.retornarPalavraOriginal());
        assertTrue(contemTodosOsCaracteres);
    }
}
