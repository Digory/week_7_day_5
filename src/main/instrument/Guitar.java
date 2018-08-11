package main.instrument;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(ColourType colour, int numberOfStrings, double priceBoughtFor) {
        super(InstrumentType.STRING, colour, priceBoughtFor);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Pling plong pling";
    }
}
