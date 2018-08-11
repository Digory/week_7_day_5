package main.instrument;

public class Triangle extends Instrument{

    public Triangle(ColourType colour) {
        super(InstrumentType.PERCUSSION, colour);
    }

    @Override
    public String play() {
        return "ding...";
    }
}
