package Instruments;

import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private int keysNum;

    public Piano(String colour, InstrumentMaterial material, InstrumentType type, double priceBought, double priceSold, int keysNum) {
        super(colour, material.METAL, type.PIANO, priceBought, priceSold);
        this.keysNum = 88;
    }

    public String play(String song){
        return "piano is playing " + song;
    }

    public double markupCost(){
        return priceBought - priceSold;
    }

    public int getKeysNum() {
        return keysNum;
    }
}
