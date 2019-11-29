package instruments;

import enums.InstrumentFamily;

public abstract class Instrument {

    private String name;
    private String material;
    private String colour;
    private InstrumentFamily family;
    private int purchasePrice;
    private int salePrice;

    public Instrument(String name, String material, String colour, InstrumentFamily family, int purchasePrice, int salePrice){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }
}
