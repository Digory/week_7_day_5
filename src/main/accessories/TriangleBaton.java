package main.accessories;

import main.instrument.InstrumentType;

public class TriangleBaton extends Accessory{

    public TriangleBaton(double priceBoughtFor) {
        super(InstrumentType.PERCUSSION, priceBoughtFor);
    }

    @Override
    public String toString(){
        return "ACCESSORY: Triangle baton " + super.toString();
    }
}
