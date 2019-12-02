package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentFamily;

public abstract class Instrument implements IPlay, ISell {

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

}
