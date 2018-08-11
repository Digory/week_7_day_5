package main.instrument;

public class Trumpet extends Instrument{

    private int numberOfValves;

    public Trumpet(ColourType colour, int numberOfValves, double priceBoughtFor) {
        super(InstrumentType.BRASS, colour, priceBoughtFor);
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
