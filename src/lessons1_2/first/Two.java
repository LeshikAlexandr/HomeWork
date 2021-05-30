package lessons1_2.first;

public class Two {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Triangle exists ");
        } else {
            System.out.println("Triangle doesn't exists");
        }
    }
}
