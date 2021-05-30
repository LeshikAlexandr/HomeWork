package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Smallest odd element: " + min);
    }
}
