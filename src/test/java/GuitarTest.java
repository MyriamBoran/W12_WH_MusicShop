import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("red", InstrumentMaterial.WOOD, InstrumentType.GUITAR, 90, 120, 6);
    }

    @Test
    public void canGetStringNum(){
        assertEquals(6, guitar.getStringNum());
    }

    @Test
    public void canPlaySong(){
        assertEquals("guitar is playing Bohemian Rhapsody", guitar.play("Bohemian Rhapsody"));
    }
}
