package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String name, String material, String colour, String family, int purchasePrice, int salePrice,
                    int numberOfStrings) {
        super(name, material, colour, family, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}
