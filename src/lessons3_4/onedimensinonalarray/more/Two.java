package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;

public class Two {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        double sumOfOddPosition = 0;
        int countOfOddPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumOfOddPosition += array[i];
                countOfOddPosition++;
            }
        }
        double result = sumOfOddPosition / countOfOddPosition;
        System.out.println("Result: " + result);
    }
}
