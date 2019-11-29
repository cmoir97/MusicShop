package instruments;

import enums.InstrumentFamily;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String name, String material, String colour, InstrumentFamily family, int purchasePrice, int salePrice,
                  int numberOfStrings) {
        super(name, material, colour, family, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}
