package Inheritance.bakery;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        super("almond");
        System.out.println("Cake{flavor='" + this.getFlavor() + "', price=" + super.getPrice() + "}");
    }

    public int setTiers(int tiers) { return tiers; }
    public void getTiers () { this.tiers = tiers; }

}
