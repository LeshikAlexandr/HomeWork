package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        boolean wrongSize = true;
        while (wrongSize) {
            if (size <= 3) {
                System.out.println("Wrong size. Try again.");
                size = scanner.nextInt();
            } else {
                wrongSize = false;
            }
        }
        int[] firstArray = new int[size];

        int sumOfEven = 0;
        for (int i = 0; i < firstArray.length; i++) {
            int number = random.nextInt(size + 1);
            firstArray[i] = number;
            if (number % 2 == 0) {
                sumOfEven++;
            }
        }
        System.out.println("First array: " + Arrays.toString(firstArray));

        int[] secondArray = new int[sumOfEven];
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                secondArray[counter++] = firstArray[i];
            }
        }
        System.out.println("Second array: " + Arrays.toString(secondArray));
    }
}
