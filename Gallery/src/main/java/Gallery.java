import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public void setArtwork(Artwork artwork){
        stock.add(artwork);
    }

    
}
