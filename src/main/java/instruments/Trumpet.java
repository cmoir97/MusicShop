package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentFamily;

public class Trumpet extends Instrument implements IPlay, ISell {
    private int numberOfValves;
    public Trumpet(String name, String material, String colour, InstrumentFamily family,
                   int purchasePrice, int salePrice, int numberOfValves) {
        super(name, material, colour, family, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }

    public String play() {
        return "Womp";
    }

    public int calculateMarkup() {
        return getSalePrice() - getPurchasePrice();
    }
}
