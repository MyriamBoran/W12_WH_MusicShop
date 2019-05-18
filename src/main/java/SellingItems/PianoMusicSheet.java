package SellingItems;

public class PianoMusicSheet extends SellingItems {
    private String songSheet;
    private int numOfPages;

    public PianoMusicSheet(String type, double priceBuy, double priceSell, String songSheet, int numOfPages) {
        super(type, priceBuy, priceSell);
        this.songSheet = songSheet;
        this.numOfPages = numOfPages;
    }

    public String getSongSheet() {
        return songSheet;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
