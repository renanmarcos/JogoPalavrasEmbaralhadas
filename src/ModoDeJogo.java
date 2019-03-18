public enum ModoDeJogo {
    DIFICIL, FACIL;

    public static ModoDeJogo fromInteger(int x) {
        switch (x) {
            case 1:
                return FACIL;
            case 2:
                return DIFICIL;
            default:
                return null;
        }
    }

    public static String retornarExplicacaoDificuldades() {
        return  "1 - Modo Fácil (Com 3 chances para acertar a palavra)" +
                "\n2 - Modo Difícil (Se errar uma vez a palavra, perde)";
    }
}
