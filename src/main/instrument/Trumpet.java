package main.instrument;

public class Trumpet extends Instrument{

    private int numberOfValves;

    public Trumpet(ColourType colour, int numberOfValves) {
        super(InstrumentType.BRASS, colour);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    @Override
    public String play() {
        return "MUHHHHHHHHHHHHHH";
    }
}
