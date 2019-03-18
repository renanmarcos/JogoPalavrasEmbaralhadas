import junit.framework.TestCase;

public class ModoDeJogoTest extends TestCase {

    public void testeFromInteger() {
        ModoDeJogo modoDeJogo = ModoDeJogo.fromInteger(1);
        assertEquals(ModoDeJogo.FACIL, modoDeJogo);

        modoDeJogo = ModoDeJogo.fromInteger(2);
        assertEquals(ModoDeJogo.DIFICIL, modoDeJogo);

        modoDeJogo = ModoDeJogo.fromInteger(3);
        assertNull(modoDeJogo);
    }

}
