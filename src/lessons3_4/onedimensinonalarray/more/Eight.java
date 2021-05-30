package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Eight {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int nextAfterMaximum = array[array.length - 1];
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i - 1] < array[i]) {
                nextAfterMaximum = array[i - 1];
                break;
            }
        }
        System.out.println("Next after maximum: " + nextAfterMaximum);
    }
}
