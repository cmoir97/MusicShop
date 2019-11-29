import enums.InstrumentFamily;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Mendini", "Brass", "Gold", InstrumentFamily.WOODWIND,
                150, 215, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Mendini", trumpet.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void canGetFamily(){
        assertEquals(InstrumentFamily.WOODWIND, trumpet.getFamily());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(150, trumpet.getPurchasePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(215, trumpet.getSalePrice());
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }
//
//    @Test
//    public void canPlayGuitar(){
//        assertEquals("Strum", guitar.play());
//    }
//
//    @Test
//    public void canCalculateMarkup(){
//        assertEquals(100, guitar.calculateMarkup());
//    }
}
