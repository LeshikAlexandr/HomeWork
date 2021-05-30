package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        double sumBiggerC = 0;
        int countBiggerC = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                sumBiggerC += array[i];
                countBiggerC++;
            }
        }
        double result = sumBiggerC / countBiggerC;
        System.out.println("Result: " + result);
    }
}
