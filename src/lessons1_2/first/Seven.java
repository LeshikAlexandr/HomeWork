package lessons1_2.first;

public class Seven {
    public static void main(String[] args) {
        int number = 314;
        String word;
        if ((number / 10) % 10 != 1 && number % 10 == 1) { // узнаем, что предпоследняя цифра числа не 1, а последняя 1 : 1, 301, 321
            word = " программист";
        } else if ((number / 10) % 10 != 1 && number % 10 >= 2 && number % 10 <= 4) { // исключить 12-14 и предусмотреть 2-4
            word = " программиста";
        } else {
            word = " программистов";
        }
        System.out.println(number + word);
    }
}