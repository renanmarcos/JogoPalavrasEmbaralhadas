package Embaralhadores;

public class InversaoPalavra implements Embaralhador {

    private String palavraOriginal;

    @Override
    public String embaralhar(String palavraOriginal) {
        this.palavraOriginal = palavraOriginal;
        StringBuilder palavra = new StringBuilder(palavraOriginal);

        return palavra.reverse().toString();
    }

    @Override
    public String retornarPalavraOriginal() {
        return this.palavraOriginal;
    }
}
