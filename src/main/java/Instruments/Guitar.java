package Instruments;

import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int stringNum;

    public Guitar(String colour, InstrumentMaterial material, InstrumentType type, double priceBought, double priceSold, int stringNum) {
        super(colour, material.WOOD, type.GUITAR, priceBought, priceSold);
        this.stringNum = 6;
    }

    public String play(String song){
        return "guitar is playing " + song;
    }

    public double markupCost(){
        return priceBought - priceSold;
    }

    public int getStringNum() {
        return stringNum;
    }
}
