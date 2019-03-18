package EmbaralhadoresTest;

import Embaralhadores.PermutacaoRandomica;
import junit.framework.TestCase;

public class PermutacaoRandomicaTest extends TestCase {

    public void testePossivelDesvendar() {
        PermutacaoRandomica embaralhador = new PermutacaoRandomica();
        String palavraOriginal = "Ornitorrinco";
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
