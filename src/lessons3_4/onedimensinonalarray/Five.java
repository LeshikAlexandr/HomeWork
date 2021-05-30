package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;

public class Five {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(16);
            secondArray[i] = random.nextInt(16);
        }

        double sumFirstArray = 0;
        double sumSecondArray = 0;

        for (int i = 0; i < firstArray.length; i++) {
            sumFirstArray += firstArray[i];
            sumSecondArray += secondArray[i];
        }

        double averageFirstArray = sumFirstArray / firstArray.length;
        double averageSecondArray = sumSecondArray / secondArray.length;

        String result;
        if (averageFirstArray > averageSecondArray) {
            result = "Average1 bigger.";
        } else if (averageSecondArray > averageFirstArray) {
            result = "Average2 bigger.";
        } else {
            result = "Average 1 is equal to Average 2.";
        }

        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));
        System.out.println("Average 1: " + averageFirstArray);
        System.out.println("Average 2: " + averageSecondArray);
        System.out.println(result);
    }
}
