import Embaralhadores.Embaralhador;
import MecanicasDeJogo.MecanicaDoJogo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo das Palavras Embaralhadas!\n");
        System.out.println("Escolha a dificuldade:");
        System.out.println(ModoDeJogo.retornarExplicacaoDificuldades());

        int opcao = 0;
        int quantidadeDeModos = ModoDeJogo.values().length;
        while (opcao > quantidadeDeModos || opcao <= 0) {
            System.out.print(": ");
            if (!entrada.hasNextInt()) {
                entrada.next();
                continue;
            }
            opcao = entrada.nextInt();
        }

        entrada.nextLine();
        ModoDeJogo modoEscolhido = ModoDeJogo.fromInteger(opcao);
        MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.retornarMecanica(modoEscolhido);
        System.out.println(mecanicaDoJogo.retornarMecanicaExplicada());

        while (mecanicaDoJogo.podeTentarNovamente()) {
            Embaralhador embaralhador = FabricaEmbaralhadores.retornarEmbaralhador();
            String palavra = BancoDePalavras.retornarPalavra();
            palavra = embaralhador.embaralhar(palavra);
            System.out.println("\nDesvende a palavra: " + palavra);
            System.out.print("Digite sua resposta: ");
            String resposta = entrada.nextLine();

            if (mecanicaDoJogo.acertouPalavra(resposta, embaralhador)) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Que pena, você errou.");
            }
            System.out.println("Pontuação atual: " + mecanicaDoJogo.retornarPontuacao());
        }

        System.out.println("\n=== O jogo terminou. Sua pontuação final: " + mecanicaDoJogo.retornarPontuacao() + " ===");
    }

}
