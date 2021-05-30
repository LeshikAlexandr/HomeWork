package lessons1_2.first;

public class One {
    public static void main(String[] args) {
        int number = 1_234_567;
        String mark = number > 0 ? "положительное" : "отрицательное";
        int rank = 0;
        while (number != 0) {
            number /= 10;
            rank++;
        }
        System.out.println("Это " + rank + "-значное " + mark + " число.");
    }
}
