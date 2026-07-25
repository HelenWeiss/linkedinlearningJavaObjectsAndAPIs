package interfaces.ecommercetshirts;

public class Shop {

    public static void main(String[] args) {

        String name = "Golf Shirt";
        double price = 49.95;
        String color = "White";
        String size = "Medium";
        Shirt shirt = Shop.buyShirt(name, price, size, color);
        System.out.println("Name: " + name + ", Price: " + price + ", Size: " + size + ", Color: " + color + ".");
    }

    // Do not change this method
    static Shirt buyShirt(String name, double price, String size, String color) {
        return new Shirt(name, price, size, color);
    }
}
