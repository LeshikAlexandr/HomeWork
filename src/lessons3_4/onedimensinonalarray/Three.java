package lessons3_4.onedimensinonalarray;

import java.util.Random;

public class Three {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEven numbers: " + even);
    }
}
