package lessons1_2.second;

public class One {
    public static void main(String[] args) {
        double result = 10;
        double day = result;
        for (int i = 0; i < 6; i++) {
            day = day + day * 0.1;
            result += day;
        }
        System.out.println("Result: " + result);
    }
}
