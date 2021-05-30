package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Ten {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int maxId = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxId = i;
            }
        }
        System.out.println("Max element: " + max + ", id: " + maxId);
        int temp = array[0];
        array[0] = array[maxId];
        array[maxId] = temp;
        System.out.println(Arrays.toString(array));
    }
}
