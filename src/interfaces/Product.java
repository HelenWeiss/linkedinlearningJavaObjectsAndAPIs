package interfaces;

public interface Product {

    //private String name; // compilation errer, variables must be static, final in interfaces, can't be changed in other class
    String getName();
    void setName(String name);

}
