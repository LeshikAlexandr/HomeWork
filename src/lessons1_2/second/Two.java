package lessons1_2.second;

public class Two {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 3; i <= 24; i += 3) {
            result = result * 2;
            System.out.println("Hour: " + i + ", result: " + result);
        }
    }
}
