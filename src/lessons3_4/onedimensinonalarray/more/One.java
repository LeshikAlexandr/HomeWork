package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class One {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                multiplication *= array[i];
            }
        }
        System.out.println("Multiplication: " + multiplication);
    }
}
