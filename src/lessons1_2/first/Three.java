package lessons1_2.first;

public class Three {
    public static void main(String[] args) {
        int number = 123;
        System.out.println("Number: " + number);
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
