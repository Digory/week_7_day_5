package main.instrument;

public class Triangle extends Instrument{

    public Triangle(ColourType colour, double priceBoughtFor) {
        super(InstrumentType.PERCUSSION, colour, priceBoughtFor);
    }

    @Override
    public String play() {
        return "ding...";
    }

    @Override
    public String toString(){
        return "INSTRUMENT: Triangle " + super.toString();
    }
}
