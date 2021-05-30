package lessons12and18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadProducts {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Products.txt"))) {
            List<Product> productList = (ArrayList<Product>) ois.readObject();
            for (Product product : productList) {
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
