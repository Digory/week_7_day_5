package main.instrument;

public enum InstrumentType {
    STRING("String"),
    BRASS("Brass"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion");

    private String category;

    InstrumentType(String category) {
        this.category = category;
    }

    public String getString() {
        return category;
    }
}
