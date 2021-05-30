package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Six {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));

        String result = " ";

        boolean needIteration = true;
        int i = 0;
        while (needIteration && i < array.length - 1) {
            needIteration = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result = "Repeat";
                    needIteration = false;
                    break;
                } else {
                    result = "Not repeat";
                    needIteration = true;
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
