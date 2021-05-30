package lessons11.four;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Car car1 = new Car("Peugeot", 220, 4500);
        Car car2 = new Car("Audi", 240, 3000);
        Car[] cars = {car1, car2};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CarsLesson11.txt"))) {

            oos.writeObject(car1);
            oos.writeObject(car2);

//            oos.writeInt(cars.length);
//            for (Car car : cars) {
//                oos.writeObject(car);
//            }
//
//            oos.writeObject(cars);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
