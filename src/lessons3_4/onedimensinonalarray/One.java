package lessons3_4.onedimensinonalarray;

public class One {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 2;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
