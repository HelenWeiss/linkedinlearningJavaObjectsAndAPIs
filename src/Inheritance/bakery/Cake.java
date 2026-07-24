package Inheritance.bakery;

public class Cake {

    private String flavor;
    private double price;

    public Cake() { this("vanilla"); }

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }


    // Do not change this method
    static Cake createCake() {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake{flavor='" + cake.getFlavor() + "', price=" + cake.getPrice() + "}");

        return cake;
    }

    // Do not change this method
    static BirthdayCake createBirthdayCake(){

        return new BirthdayCake();
    }

    // Do not change this method
    static WeddingCake createWeddingCake(){
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);
        System.out.println("Cake{flavor='" + weddingCake.getFlavor() + "', price=" + weddingCake.getPrice() + "}");

        return weddingCake;
    }

    public String getFlavor () { return flavor; }
    public void setFlavor (String flavor) { this.flavor = flavor; }

    public double getPrice () { return price; }
    public void setPrice (double price) { this.price = price; }

}
