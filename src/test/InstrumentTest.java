package test;

import main.instrument.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Guitar guitar;
    private Triangle triangle;
    private Trumpet trumpet;

    @Before
    public void before(){
        guitar = new Guitar(ColourType.BLACK, 6);
        triangle = new Triangle(ColourType.PINK);
        trumpet = new Trumpet(ColourType.BLUE, 4);
    }

    @Test
    public void getCategoryReturnsCorrect(){
        assertEquals(InstrumentType.STRING, guitar.getCategory());
    }

    @Test
    public void getNumberOfStringsReturnsCorrect(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getNumberOfValvesReturnsCorrect(){
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void playReturnsCorrect(){
        assertEquals("ding...", triangle.play());
    }
}
