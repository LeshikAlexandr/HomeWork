package lessons11.four;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CarsLesson11.txt"))) {

            Car car1 = (Car) ois.readObject();
            Car car2 = (Car) ois.readObject();
            System.out.println(car1);
            System.out.println(car2);
//
//            int length = ois.readInt();
//            Car[] cars = new Car[length];
//
//            for (int i = 0; i < cars.length; i++) {
//                cars[i] = (Car) ois.readObject();
//            }
//
//            Car[] cars = (Car[]) ois.readObject();
//
//            System.out.println(Arrays.toString(cars));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
