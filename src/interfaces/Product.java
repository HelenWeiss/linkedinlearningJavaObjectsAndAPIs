package interfaces;

public interface Product {

    //private String name; // compilation errer, variables must be static, final in interfaces, can't be changed in other class
    String getName();
    void setName(String name);

    default double getPrice(){return 50;}; // without keyword "default" a method must be implement in a class Book // default needs a body {}
    default void setPrice(double price) {}; // default needs a body {}

}
