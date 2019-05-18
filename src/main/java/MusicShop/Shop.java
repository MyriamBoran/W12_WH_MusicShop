package MusicShop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item){
        this.stock.remove(item);
    }


    public int getStockCount(){
        return stock.size();
    }

    public double calculateProfit(){
        double profit = 0;
        for(ISell item : this.stock){
            profit += item.markupCost();
        }
        return -profit;
    }
}
