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
//
//    @Test
//    public void canGetMaterial(){
//        assertEquals("oak", guitar.getMaterial());
//    }
//
//    @Test
//    public void canGetColour(){
//        assertEquals("red", guitar.getColour());
//    }
//
//    @Test
//    public void canGetFamily(){
//        assertEquals(InstrumentFamily.STRINGS, guitar.getFamily());
//    }
//
//    @Test
//    public void canGetPurchasePrice(){
//        assertEquals(100, guitar.getPurchasePrice());
//    }
//
//    @Test
//    public void canGetSalePrice(){
//        assertEquals(200, guitar.getSalePrice());
//    }
//
//    @Test
//    public void canGetNumberOfStrings(){
//        assertEquals(4, guitar.getNumberOfStrings());
//    }
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
