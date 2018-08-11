package test;

import main.accessories.GuitarPlectrum;
import main.accessories.TriangleBaton;
import main.accessories.TrumpetSheetMusic;
import main.instrument.ColourType;
import main.instrument.Guitar;
import main.instrument.Triangle;
import main.instrument.Trumpet;
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
}
