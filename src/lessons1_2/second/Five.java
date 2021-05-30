package lessons1_2.second;

public class Five {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " - " + i * 2.54 + "; ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
