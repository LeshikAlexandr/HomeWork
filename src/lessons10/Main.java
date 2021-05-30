package lessons10;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car("Peugeot", 220, 4500);
        peugeot.getInfo();
        Car audi = new Car();
        audi.setBrand("Audi");
        audi.setSpeed(250);
        audi.setPrice(6000);
        audi.getInfo();
        checkCar(peugeot);
        checkCar(audi);
    }

    public static void checkCar(AbleToRide car) {
        try {
            car.start();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
