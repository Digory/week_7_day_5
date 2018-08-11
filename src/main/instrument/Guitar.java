package main.instrument;

public class Guitar extends Instrument{

    public Guitar(ColourType colour) {
        super(InstrumentType.STRING, colour);
    }

    @Override
    public String play() {
        return "Pling plong pling";
    }
}
