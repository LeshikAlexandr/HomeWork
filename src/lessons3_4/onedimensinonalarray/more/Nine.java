package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Nine {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        int minEven = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < minEven) {
                minEven = array[i];
            }
        }
        System.out.println("Min even index element: " + minEven);
    }
}
