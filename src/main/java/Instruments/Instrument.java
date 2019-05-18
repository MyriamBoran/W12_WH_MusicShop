package Instruments;

import Enums.InstrumentMaterial;
import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    protected String colour;
    protected InstrumentMaterial material;
    protected InstrumentType type;
    protected double priceBought;
    protected double priceSold;

    public Instrument(String colour, InstrumentMaterial material, InstrumentType type, double priceBought, double priceSold){
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }
}
