package main.instrument;

public enum ColourType {
    RED("Red"),
    GREEN("Green"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    PINK("Pink"),
    BLACK("Black"),
    WHITE("White");

    private String colour;

    ColourType(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
