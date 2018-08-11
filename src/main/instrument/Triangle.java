package main.instrument;

public class Triangle extends Instrument{

    public Triangle(ColourType colour, double priceBoughtFor) {
        super(InstrumentType.PERCUSSION, colour, priceBoughtFor);
    }

    @Override
    public String play() {
        return "ding...";
    }
}
