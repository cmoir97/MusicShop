package accessories;

import behaviours.ISell;

public class SheetMusic extends Accessory{
    public SheetMusic(String name, int purchasePrice, int salePrice) {
        super(name, purchasePrice, salePrice);
    }

    public int calculateMarkup() {
        return getSalePrice() - getPurchasePrice();
    }
}
