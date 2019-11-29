import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Bassoon for Beginners", 5, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Bassoon for Beginners", sheetMusic.getName());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(5, sheetMusic.getPurchasePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(10, sheetMusic.getSalePrice());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(5, sheetMusic.calculateMarkup());
    }

}
