package main.accessories;

import main.instrument.InstrumentType;

public class TrumpetSheetMusic extends Accessory{

    public TrumpetSheetMusic(double priceBoughtFor) {
        super(InstrumentType.BRASS, priceBoughtFor);
    }

    @Override
    public String toString(){
        return "ACCESSORY: Trumpet sheet music " + super.toString();
    }
}
