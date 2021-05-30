package lessons11.four;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private double price;

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "The car brand is " + brand + ", speed - " + speed + ", price - " + price + ".";
    }
}
