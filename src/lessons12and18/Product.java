package lessons12and18;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Objects;

public class Product implements Comparable<Product>, Serializable {


    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) throws InputMismatchException {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Product: " + name + ", ID: " + id + ", price: " + price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice()) {
            return 1;
        } else if (this.getPrice() < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
