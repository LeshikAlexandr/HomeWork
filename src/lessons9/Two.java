package lessons9;

public class Two {
    public static void main(String[] args) {
        String line = "Hello, World!";
        char a = line.charAt(0);
        char b = line.charAt(3);
        System.out.println(a);
        System.out.println(b);
        line = line.replace(b, a);
        System.out.println(line);
    }
}
