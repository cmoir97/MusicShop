package accessories;

public abstract class Accessory {
    private String name;
    private int purchasePrice;
    private int salePrice;

    public Accessory(String name, int purchasePrice, int salePrice){
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }


    public String getName() {
        return name;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }
}
