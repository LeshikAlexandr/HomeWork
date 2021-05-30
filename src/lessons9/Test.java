package lessons9;

public class Test {
    public static void main(String[] args) {
        String line = "Hello. It's string";
        String[] split = line.split("\\.");
        for (String s: split) {
            System.out.println(s);
        }
    }
}
