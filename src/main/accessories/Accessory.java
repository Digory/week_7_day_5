package main.accessories;

import main.instrument.InstrumentType;
import main.interfaces.ISell;

public abstract class Accessory implements ISell {

    protected InstrumentType category;
    protected double priceBoughtFor;
    protected double priceSoldFor;

    public Accessory(InstrumentType category, double priceBoughtFor) {
        this.category = category;
        this.priceBoughtFor = priceBoughtFor;
        priceSoldFor = priceBoughtFor + calculateMarkup();
    }

    public double getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public double getPriceSoldFor() {
        return priceSoldFor;
    }

    @Override
    public double calculateMarkup(){
        return 2 * priceBoughtFor;
    }

    @Override
    public InstrumentType getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return "CATEGORY: " + getCategory().getString() + " PRICE: £" + String.format("%.2f", getPriceSoldFor());
    }
}
