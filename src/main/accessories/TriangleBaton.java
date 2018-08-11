package main.accessories;

import main.instrument.InstrumentType;

public class TriangleBaton extends Accessory{

    public TriangleBaton(double priceBoughtFor) {
        super(InstrumentType.PERCUSSION, priceBoughtFor);
    }
}
