package Inheritance.bakery;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        super("almond");
        System.out.println("Cake{flavor='" + this.getFlavor() + "', price=" + super.getPrice() + "}");
    }

    public int getTiers () { return tiers; }
    public void setTiers(int tiers) { this.tiers = tiers; }

}
