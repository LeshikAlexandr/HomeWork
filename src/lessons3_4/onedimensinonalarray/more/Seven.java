package lessons3_4.onedimensinonalarray.more;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
