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
        guitar = new Guitar(ColourType.BLACK, 6, 30.0);
        triangle = new Triangle(ColourType.PINK, 5.0);
        trumpet = new Trumpet(ColourType.BLUE, 4, 50.0);
    }

    @Test
    public void getCategory_guitar(){
        assertEquals(InstrumentType.STRING, guitar.getCategory());
    }

    @Test
    public void getCategoryAsString_triangle(){
        assertEquals("Percussion", triangle.getCategory().getString());
    }

    @Test
    public void getNumberOfStrings_guitar(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getNumberOfValves_trumpet(){
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void play_triangle(){
        assertEquals("ding...", triangle.play());
    }

    @Test
    public void calculateMarkup_trumpet(){
        assertEquals(25.0, trumpet.calculateMarkup(),0);
    }

    @Test
    public void getPriceBoughtFor_guitar(){
        assertEquals(30.0, guitar.getPriceBoughtFor(), 0);
    }

    @Test
    public void getPriceSoldFor_guitar(){
        assertEquals(45.0, guitar.getPriceSoldFor(), 0);
    }
}
