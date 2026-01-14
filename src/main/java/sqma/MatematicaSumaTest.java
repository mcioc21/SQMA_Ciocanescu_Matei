package sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicaSumaTest {
    @Test
    void sumaPozitive() {
        Matematica m = new Matematica();
        assertEquals(7, m.suma(3,4));
    }

    @Test
    void sumaCuZero() {
        Matematica m = new Matematica();
        assertEquals(5, m.suma(5,0));
    }
}
