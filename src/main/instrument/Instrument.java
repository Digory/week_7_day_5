package main.instrument;

import main.interfaces.IPlay;
import main.interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    protected InstrumentType category;
    protected ColourType colour;
    protected double priceBoughtFor;
    protected double priceSoldFor;

    public Instrument(InstrumentType category, ColourType colour, double priceBoughtFor) {
        this.category = category;
        this.colour = colour;
        this.priceBoughtFor = priceBoughtFor;
        priceSoldFor = 1.5 * priceBoughtFor;
    }

    @Override
    public double calculateMarkup(){
        return 0.5 * priceBoughtFor;
    }

    public double getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public InstrumentType getCategory() {
        return category;
    }

    public ColourType getColour() {
        return colour;
    }

}
