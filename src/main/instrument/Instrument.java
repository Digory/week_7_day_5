package main.instrument;

import main.interfaces.IPlay;

public abstract class Instrument implements IPlay {
    protected InstrumentType category;
    protected ColourType colour;

    public Instrument(InstrumentType category, ColourType colour) {
        this.category = category;
        this.colour = colour;
    }

    public InstrumentType getCategory() {
        return category;
    }

    public ColourType getColour() {
        return colour;
    }

}
