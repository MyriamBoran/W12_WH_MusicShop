import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void setUp(){
        cello = new Cello("brown", InstrumentMaterial.WOOD, InstrumentType.CELLO, 150, 190, 4);
    }

    @Test
    public void canGetStringNum(){
    assertEquals(4, cello.getStringNum());
    }

    @Test
    public void canPlaySong(){
        assertEquals("cello is playing Nessun Dorma", cello.play("Nessun Dorma"));
    }
}




