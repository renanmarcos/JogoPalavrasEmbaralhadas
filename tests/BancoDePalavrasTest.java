import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BancoDePalavrasTest extends TestCase {

    public void testRetornarPalavra() throws IOException {
        String palavra = BancoDePalavras.retornarPalavra();
        String palavraDoBanco;
        boolean encontrou = false;

        BufferedReader reader = new BufferedReader(new FileReader("palavras.txt"));
        while ((palavraDoBanco = reader.readLine()) != null) {
            encontrou = palavra.equals(palavraDoBanco);
            if (encontrou) break;
        }
        reader.close();
        assertTrue(encontrou);
    }

}
