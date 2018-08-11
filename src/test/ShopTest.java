package test;

import main.accessories.GuitarPlectrum;
import main.accessories.TriangleBaton;
import main.accessories.TrumpetSheetMusic;
import main.instrument.*;
import main.shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Triangle triangle;
    private Trumpet trumpet;
    private GuitarPlectrum plectrum;
    private TriangleBaton baton;
    private TrumpetSheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(ColourType.GREEN, 12, 13.0);
        triangle = new Triangle(ColourType.BLUE, 4.0);
        trumpet = new Trumpet(ColourType.WHITE, 4, 22.0);
        plectrum = new GuitarPlectrum(0.5);
        baton = new TriangleBaton(1.5);
        sheetMusic = new TrumpetSheetMusic(8.0);
    }

    @Test
    public void addToStock_instruments(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        assertEquals(3, shop.getAllStock().size());
    }

    @Test
    public void addToStock_instruments_and_accessories(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        assertEquals(6, shop.getAllStock().size());
    }

    @Test
    public void removeItem_returns_true(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        boolean actual = shop.removeItem(triangle);
        assertEquals(true, actual);
    }

    @Test
    public void removeItem_returns_false(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        boolean actual = shop.removeItem(trumpet);
        assertEquals(false, actual);
    }

    @Test
    public void removeItem_removes_item(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.removeItem(triangle);
        assertEquals(1, shop.getAllStock().size());
    }

    @Test
    public void calculatePotentialProfit(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        assertEquals(39.5, shop.calculatePotentialProfit(), 0);
    }

    @Test
    public void removeInstrumentsInThisCategory_returns_true(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeInstrumentsInThisCategory(InstrumentType.BRASS);
        assertEquals(true, actual);
    }

    @Test
    public void removeInstrumentsInThisCategory_returns_false(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeInstrumentsInThisCategory(InstrumentType.WOODWIND);
        assertEquals(false, actual);
    }

    @Test
    public void removeInstrumentsInThisCategory_removes_single_item(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeInstrumentsInThisCategory(InstrumentType.BRASS);
        assertEquals(5, shop.getAllStock().size());
    }

    @Test
    public void removeInstrumentsInThisCategory_removes_multiple_items(){
        shop.addToStock(guitar);
        shop.addToStock(new Guitar(ColourType.RED, 6, 10.0));
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeInstrumentsInThisCategory(InstrumentType.STRING);
        assertEquals(5, shop.getAllStock().size());
    }

    @Test
    public void removeAccessoriesInThisCategory_returns_true(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeAccessoriesInThisCategory(InstrumentType.BRASS);
        assertEquals(true, actual);
    }

    @Test
    public void removeAccessoriesInThisCategory_returns_false(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeAccessoriesInThisCategory(InstrumentType.WOODWIND);
        assertEquals(false, actual);
    }

    @Test
    public void removeAccessoriesInThisCategory_removes_single_item(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        shop.removeAccessoriesInThisCategory(InstrumentType.BRASS);
        assertEquals(5, shop.getAllStock().size());
    }

    @Test
    public void removeAccessoriesInThisCategory_removes_multiple_items(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(new GuitarPlectrum(1.0));
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        shop.removeAccessoriesInThisCategory(InstrumentType.STRING);
        assertEquals(5, shop.getAllStock().size());
    }

    @Test
    public void removeAllInThisCategory_returns_true(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeAllInThisCategory(InstrumentType.BRASS);
        assertEquals(true, actual);
    }

    @Test
    public void removeAllInThisCategory_returns_false(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        boolean actual = shop.removeAllInThisCategory(InstrumentType.WOODWIND);
        assertEquals(false, actual);
    }

    @Test
    public void removeAllInThisCategory_removesItems(){
        shop.addToStock(guitar);
        shop.addToStock(triangle);
        shop.addToStock(trumpet);
        shop.addToStock(plectrum);
        shop.addToStock(baton);
        shop.addToStock(sheetMusic);
        shop.removeAllInThisCategory(InstrumentType.BRASS);
        assertEquals(4, shop.getAllStock().size());
    }
}
