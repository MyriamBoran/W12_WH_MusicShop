package SellingItems;

public class GuitarStrings extends SellingItems {

    private String typeOfStrings;
    private int numOfStrings;

    public GuitarStrings(String type, double priceBuy, double priceSell, String typeOfStrings, int numOfStrings) {
        super(type, priceBuy, priceSell);
        this.typeOfStrings = typeOfStrings;
        this.numOfStrings = numOfStrings;
    }

    public String getTypeOfStrings() {
        return typeOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
