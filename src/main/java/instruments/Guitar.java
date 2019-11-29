package instruments;

import behaviours.IPlay;
import enums.InstrumentFamily;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String name, String material, String colour, InstrumentFamily family, int purchasePrice, int salePrice,
                  int numberOfStrings) {
        super(name, material, colour, family, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String play() {
        return "Strum";
    }
}
