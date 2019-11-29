import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
