import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("black", InstrumentMaterial.METAL, InstrumentType.PIANO, 460, 899, 88);
    }

    @Test
    public void canGetKeyNum(){
        assertEquals(88, piano.getKeysNum());
    }

    @Test
    public void canPlaySong(){
        assertEquals("piano is playing ballade pour adeline", piano.play("ballade pour adeline"));
    }
}

