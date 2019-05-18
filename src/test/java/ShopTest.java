import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Instruments.Piano;
import MusicShop.Shop;
import SellingItems.PianoMusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    PianoMusicSheet musicSheet;

    @Before
    public void setUp() {
        shop = new Shop();
        piano = new Piano("black",  InstrumentMaterial.METAL, InstrumentType.PIANO, 460.23, 899.33, 88);
        musicSheet = new PianoMusicSheet("Chord chart", 15.89, 23.22, "Diminished piano chords chart", 5);
    }

    @Test
    public void canGetMusicSheetType() {
        assertEquals("Chord chart", musicSheet.getType());
    }

    @Test
    public void canSetMusicSheetType() {
        musicSheet.setType("Braille chart");
        assertEquals("Braille chart", musicSheet.getType());
    }

    @Test
    public void canGetMusicSheetNumOfPages() {
        assertEquals(5, musicSheet.getNumOfPages());
    }

    @Test
    public void canGetSongSheet() {
        assertEquals("Diminished piano chords chart", musicSheet.getSongSheet());
    }

    @Test
    public void canGetPriceBuy() {
        assertEquals(15.89, musicSheet.getPriceBuy(), 0.1);
    }

    @Test
    public void canSetPriceBuy() {
        musicSheet.setPriceBuy(18.49);
        assertEquals(18.49, musicSheet.getPriceBuy(), 0.1);
    }

    @Test
    public void canGetPriceSell() {
        assertEquals(23.22, musicSheet.getPriceSell(), 0.1);
    }

    @Test
    public void canSetPriceSell() {
        musicSheet.setPriceSell(21.33);
        assertEquals(21.33, musicSheet.getPriceSell(), 0.1);
    }

    @Test
    public void canDoMarkupCalculation() {
        assertEquals(7.33, musicSheet.markupCost(), 0.1);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(piano);
        shop.addItem(musicSheet);
        assertEquals(2, shop.getStockCount());
    }


    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(piano);
        shop.addItem(musicSheet);
        shop.removeItem(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canCalculateProfit(){
        shop.addItem(piano);
        assertEquals(439.1, shop.calculateProfit(), 0.1);
    }
}
