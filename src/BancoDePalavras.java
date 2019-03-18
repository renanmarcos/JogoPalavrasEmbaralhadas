import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class BancoDePalavras {
    private static BufferedReader reader;
    private static int cont;

    public static String retornarPalavra() {
        try {
            abrirArquivo();
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(cont);
            String palavra = reader.readLine();

            for (int i = 0; i < numeroAleatorio; i++)
                palavra = reader.readLine();

            return palavra;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static void abrirArquivo() throws IOException {
        reader = new BufferedReader(new FileReader("palavras.txt"));
        if (cont > 0) return;

        cont = 0;
        while (reader.readLine() != null) {
            cont++;
        }
        reader.close();
        reader = null;
        reader = new BufferedReader(new FileReader("palavras.txt"));
    }
}
