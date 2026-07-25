package interfaces;

public class Library {

    public static void main(String[] args) {

        //Product book = new Product(); // error, Product=interface, from interface it is impossible object creation
        Product book = new Book();
        book.setName("In the kitchen with H+ Sport");
    }
}
