package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
