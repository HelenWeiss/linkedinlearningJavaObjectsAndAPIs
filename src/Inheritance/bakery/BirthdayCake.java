package Inheritance.bakery;

public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        super("chocolate");
        System.out.println("Cake{flavor='" + this.getFlavor() + "', price=" + super.getPrice() + "}");
    }

    public int setCandles (int candles) { return candles; }
    public void getCandles () { this.candles = candles; }

}
