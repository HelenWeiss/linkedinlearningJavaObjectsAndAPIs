package Inheritance.bakery;

public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        super("chocolate");
        System.out.println("Cake{flavor='" + this.getFlavor() + "', price=" + super.getPrice() + "}");
    }

    public int getCandles () { return candles; }
    public void setCandles (int candles) { this.candles = candles; }

}
