package main.shop;

import main.accessories.Accessory;
import main.instrument.Instrument;
import main.instrument.InstrumentType;
import main.interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public boolean removeItem(ISell item){
        return stock.remove(item);
    }

    public ArrayList getAllStock(){
        return stock;
    }

    public double calculatePotentialProfit(){
        double total = 0;
        for(ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public boolean removeAllInThisCategory(InstrumentType category){
         boolean instrumentsRemoved = removeInstrumentsInThisCategory(category);
         boolean accessoriesRemoved = removeAccessoriesInThisCategory(category);
         return instrumentsRemoved || accessoriesRemoved;
    }

    public boolean removeInstrumentsInThisCategory(InstrumentType category){
        ArrayList<ISell> toBeRemoved = new ArrayList<>();
        for(ISell item : stock){
            if(item instanceof Instrument){
                if(((Instrument) item).getCategory() == category){
                    toBeRemoved.add(item);
                }
            }
        }
        return stock.removeAll(toBeRemoved);
    }

    public boolean removeAccessoriesInThisCategory(InstrumentType category){
        ArrayList<ISell> toBeRemoved = new ArrayList<>();
        for(ISell item : stock){
            if(item instanceof Accessory){
                if(((Accessory) item).getCategory() == category){
                    toBeRemoved.add(item);
                }
            }
        }
        return stock.removeAll(toBeRemoved);
    }

}
