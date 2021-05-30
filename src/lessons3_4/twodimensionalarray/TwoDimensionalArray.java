package lessons3_4.twodimensionalarray;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // 1. Сумма четных элементов, стоящих на главной диагонали.
        int sumOfEvenElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] % 2 == 0) {
                sumOfEvenElements += array[i][i];
            }
        }
        System.out.println("Sum of even elements: " + sumOfEvenElements);
        System.out.println();

        // 2. Нечетные элементы под главной диагональю включительно.
        System.out.println("Odd elements under main diagonal: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        // 3. Произведение элементов какой диагонали больше.
        int firstDiagonal = 1;
        for (int i = 0; i < array.length; i++) {
            firstDiagonal *= array[i][i];
        }

        int secondDiagonal = 1;
        for (int i = 0; i < array.length; i++) {
            secondDiagonal *= array[i][array[i].length - 1 - i];
        }
        System.out.println();
        System.out.println("Bigger multiplication.");
        System.out.println("First diagonal: " + firstDiagonal + ", second diagonal: " + secondDiagonal);
        System.out.println(firstDiagonal > secondDiagonal ? "First diagonal bigger" : "Second diagonal bigger");
        System.out.println();

        // 4. Сумма четный элементов, стоящий над побочной диагональню (невключительно).
        System.out.println("Sum of even elements over the side diagonal.");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 2 - i; j >= 0; j--) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        // 5. Транспонировать матрицу.
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("New array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
