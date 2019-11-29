import enums.InstrumentFamily;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

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

    @Test
    public void canGetPurchasePrice(){
        assertEquals(100, guitar.getPurchasePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(200, guitar.getSalePrice());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, guitar.calculateMarkup());
    }

    @Test
    public void canSetName(){
        guitar.setName("Les Paul");
        assertEquals("Les Paul", guitar.getName());
    }

    @Test
    public void canSetPurchasePrice(){
        guitar.setPurchasePrice(150);
        assertEquals(150, guitar.getPurchasePrice());
    }

    @Test
    public void canSetSalePrice(){
     guitar.setSalePrice(250);
     assertEquals(250, guitar.getSalePrice());
    }
}
