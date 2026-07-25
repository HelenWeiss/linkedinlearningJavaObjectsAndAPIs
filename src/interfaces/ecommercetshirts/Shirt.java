package interfaces.ecommercetshirts;

public class Shirt implements Product {

    private String name;
    private double price;

    /**********************************************************
     TODO: Update this class to implement the Product interface.
     ***********************************************************/
    private String size;
    private String color;

    public Shirt(String name, double price, String size, String color){
        setName(name);
        setPrice(price);
        setSize(size);
        setColor(color);
    }

    public void setSize(String size){ this.size = size; }
    public String getSize(){ return size; }
    public void setColor(String color){ this.color = color; }
    public String getColor(){ return color; }

    // implementation from ProductTshirt
    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void setPrice(double price) { this.price = price; }

}
