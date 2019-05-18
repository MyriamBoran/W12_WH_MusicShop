package SellingItems;

import Interfaces.ISell;

public abstract class SellingItems implements ISell {
    private String type;
    private double priceBuy;
    private double priceSell;

    public SellingItems(String type, double priceBuy, double priceSell) {
        this.type = type;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public String getType(){
        return type;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public double markupCost(){
        return priceSell - priceBuy;
    }
}
