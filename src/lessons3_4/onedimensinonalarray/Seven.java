package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        int max = array[0];
        int maxId = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxId = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max element: " + max + ", id: " + maxId + ".");
    }
}
