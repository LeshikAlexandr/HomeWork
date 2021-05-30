package lessons10;

import java.util.Random;

public class Car implements AbleToRide {

    private String brand;
    private int speed;
    private double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public void start() throws MyException {
        Random random = new Random();
        int number = random.nextInt(21);
        System.out.println("Car is " + brand + ", random number " + number);
        if (number % 2 == 0) {
            throw new MyException("Even number. Error. Car is " + brand + ", random number is even.");
        }
    }

    public void getInfo() {
        System.out.println("Car brand: " + brand + ", speed: " + speed + ", price: " + price + ".");
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
}
