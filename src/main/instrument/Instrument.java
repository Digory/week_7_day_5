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
        priceSoldFor = priceBoughtFor + calculateMarkup();
    }

    public double getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public double getPriceSoldFor() {
        return priceSoldFor;
    }

    public ColourType getColour() {
        return colour;
    }

    @Override
    public double calculateMarkup(){
        return 0.5 * priceBoughtFor;
    }

    @Override
    public InstrumentType getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return "COLOUR: " + getColour().getString() + " CATEGORY: " + getCategory().getString() + " PRICE: " + getPriceSoldFor();
    }

}
