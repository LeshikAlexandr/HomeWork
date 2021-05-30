package lessons3_4.onedimensinonalarray;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int[] array = new int[count];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
        System.out.println("Forward");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nBack");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
