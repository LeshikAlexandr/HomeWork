package lessons3_4.onedimensinonalarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        boolean wrongSize = true;
        while (wrongSize) {
            if (size <= 0 || size % 2 != 0) {
                System.out.println("Wrong size. Try again.");
                size = scanner.nextInt();
            } else {
                wrongSize = false;
            }
        }
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }

        int averageId = array.length / 2 - 1;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= averageId) {
                sumLeft += array[i];
            } else {
                sumRight += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sum left : " + sumLeft + ", sum right: " + sumRight);
        System.out.println(sumLeft > sumRight ? "Sum left bigger." : sumLeft < sumRight ? "Sum right bigger." : "Sum left is equal to sum right.");
    }
}
