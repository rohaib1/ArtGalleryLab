public class Customer {
    private String name;
    private double wallet;
    public Customer( String name, double wallet){
        this.name = name;
        this.wallet= 1000;
    }
    public String getName(){
        return this.name;
    }
    public double getWallet(){
        return this.wallet;
    }
    public void addWallet(double amount){
        this.wallet += amount;
    }
    public void subtractWallet(double amount){
        this.wallet -= amount;
    }
}
