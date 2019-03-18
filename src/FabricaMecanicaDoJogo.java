import MecanicasDeJogo.*;

public abstract class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo retornarMecanica(ModoDeJogo modoEscolhido) {
        if (modoEscolhido == ModoDeJogo.DIFICIL) return new ModoDificil();
        return new ModoFacil();
    }

}
