package Instruments;

import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Cello extends Instrument implements IPlay, ISell {
    private int stringNum;

    public Cello(String colour, InstrumentMaterial material, InstrumentType type, double priceBought, double priceSold, int stringNum) {
        super(colour, material.WOOD, type.CELLO, priceBought, priceSold);
        this.stringNum = 4;
    }

    public String play(String song){
        return "cello is playing " + song;
    }

    public double markupCost(){
        return priceBought - priceSold;
    }

    public int getStringNum() {
        return stringNum;
    }
}
