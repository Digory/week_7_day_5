package main.accessories;

import main.instrument.InstrumentType;

public class GuitarPlectrum extends Accessory{

    public GuitarPlectrum(double priceBoughtFor) {
        super(InstrumentType.STRING, priceBoughtFor);
    }

    @Override
    public String toString(){
        return "ACCESSORY: Guitar plectrum " + super.toString();
    }
}
