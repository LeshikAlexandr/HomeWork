package lessons9;

public class One {
    public static void main(String[] args) {
        String line = "aaa bbb ccc ddd eee fff ggg";
        String b = "b";
        String f = "f";
        int i = line.indexOf(b);
        int j = line.lastIndexOf(f);
        System.out.println(line);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        line = line.substring(i, j + 1);
        System.out.println(line);
    }
}
