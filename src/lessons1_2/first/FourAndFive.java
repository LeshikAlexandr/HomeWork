package lessons1_2.first;

public class FourAndFive {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = -1;

        int positive = 0;
        int negative = 0;

        if (a > 0) {
            positive++;
        } else if (a < 0) {
            negative++;
        }

        if (b > 0) {
            positive++;
        } else if (b < 0) {
            negative++;
        }

        if (c > 0) {
            positive++;
        } else if (c < 0) {
            negative++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
