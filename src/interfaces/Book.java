package interfaces;

// class can extend only 1 class and implement multiple interfaces
// public class ElectronicBook implements Product, DigitalFile {...}
// click via right button of the mouse -> Generate -> Implement methods (from an Interface)
// private String name; Getter -> return name; Setter -> this.name = name;

public class Book implements Product {

    private String name;
    private String author;
    private int pages;
    private String isbn;

    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public String getIsbn() { return isbn; }

    public void setAuthor(String author) { this.author = author; }
    public void setPages(int pages) { this.pages = pages; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
