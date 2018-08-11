package main.instrument;

public enum ColourType {
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    BLUE("blue"),
    PINK("pink"),
    BLACK("black"),
    WHITE("white");

    private String colour;

    ColourType(String colour) {
        this.colour = colour;
    }

    public String getString() {
        return colour;
    }
}
