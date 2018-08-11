package main.interfaces;

import main.instrument.InstrumentType;

public interface ISell {

    double calculateMarkup();
    InstrumentType getCategory();
}
