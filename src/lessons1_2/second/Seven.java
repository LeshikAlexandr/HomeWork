package lessons1_2.second;

public class Seven {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 99; i += 2) {
            result += i;
        }
        System.out.println(result);
    }
}
