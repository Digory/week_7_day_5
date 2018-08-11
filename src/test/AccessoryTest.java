package test;

import main.accessories.GuitarPlectrum;
import main.accessories.TriangleBaton;
import main.accessories.TrumpetSheetMusic;
import main.instrument.Instrument;
import main.instrument.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private GuitarPlectrum plectrum;
    private TriangleBaton baton;
    private TrumpetSheetMusic sheetMusic;

    @Before
    public void before(){
        plectrum = new GuitarPlectrum(0.5);
        baton = new TriangleBaton(1.2);
        sheetMusic = new TrumpetSheetMusic(2.0);
    }

    @Test
    public void getCategory_plectrum(){
        assertEquals(InstrumentType.STRING, plectrum.getCategory());
    }

    @Test
    public void getPriceBoughtFor_baton(){
        assertEquals(1.2, baton.getPriceBoughtFor(), 0);
    }

    @Test
    public void getPriceSoldFor_sheetMusic(){
        assertEquals(6, sheetMusic.getPriceSoldFor(), 0);
    }

    @Test
    public void calculateMarkup_plectrum(){
        assertEquals(1, plectrum.calculateMarkup(), 0);
    }
}
