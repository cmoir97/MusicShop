import enums.InstrumentFamily;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "oak", "red", InstrumentFamily.STRINGS,
                100, 200, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("oak", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void canGetFamily(){
        assertEquals(InstrumentFamily.STRINGS, guitar.getFamily());
    }
}