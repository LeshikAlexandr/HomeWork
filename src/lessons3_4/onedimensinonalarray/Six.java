package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;

public class Six {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                result = false;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(result ? "Array grow." : "Array doesn't grow.");
    }
}
