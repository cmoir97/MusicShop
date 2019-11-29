import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private int cashInTill;

    public Shop(int cashInTill){
        this.cashInTill = cashInTill;
        stock = new ArrayList<ISell>();
    }

    public int getShopBalance(){
        return cashInTill;
    }

    public int stockCount(){
        return stock.size();
    }

    public void addItemToStock(ISell newItem){
        stock.add(newItem);
    }

    public void removeItemFromStock(ISell itemToRemove){
        stock.remove(itemToRemove);
    }

    public int potentialProfit(){
        int total = 0;
        for (ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
