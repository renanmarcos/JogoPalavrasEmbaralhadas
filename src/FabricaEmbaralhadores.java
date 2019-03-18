import Embaralhadores.*;

import java.util.Random;

public abstract class FabricaEmbaralhadores {

    private static int quantidadeEmbaralhadores = 2;

    public static Embaralhador retornarEmbaralhador() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(quantidadeEmbaralhadores) + 1;

        switch (numeroAleatorio) {
            case 1:
                return new InversaoPalavra();
            default:
                return new PermutacaoRandomica();
        }
    }
}
