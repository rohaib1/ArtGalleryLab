public class Artwork {
    private String title;
    private String artist;
    private double price;


    public Artwork(String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setArtist(String artist) {
    //     this.artist = artist;
    // }

    public void setPrice(double price) {
        this.price = price;
    }
}
