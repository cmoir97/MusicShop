import accessories.SheetMusic;
import enums.InstrumentFamily;
import instruments.Guitar;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop(1000);
        guitar = new Guitar("Fender", "oak", "red", InstrumentFamily.STRINGS,
                100, 200, 4);
        trumpet = new Trumpet("Mendini", "Brass", "Gold", InstrumentFamily.WOODWIND,
                150, 215, 3);
        sheetMusic = new SheetMusic("Bassoon for Beginners", 5, 10);
    }

    @Test
    public void canGetCashInTill(){
        assertEquals(1000, shop.getShopBalance());
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, shop.stockCount());
    }
}
