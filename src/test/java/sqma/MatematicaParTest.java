package sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicaParTest {

    @Test
    void esteParTrue() {
        Matematica m = new Matematica();
        assertTrue(m.estePar(10));
    }

    @Test
    void esteParFalse() {
        Matematica m = new Matematica();
        assertFalse(m.estePar(7));
    }
}
