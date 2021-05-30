package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;

public class Eight {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(10);
            secondArray[i] = random.nextInt(10);
        }

        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (double) firstArray[i] / (double) secondArray[i];
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));
    }
}
