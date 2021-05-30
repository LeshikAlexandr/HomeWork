package lessons9;

public class TwoTextFormatter {

    public static int checkSentence(String sentence) {
        int countOfWords = 0;
        String[] words = sentence.split(" ");
        for (String word : words) {
            countOfWords++;
        }
        return countOfWords;
    }

    public static boolean checkPalindrome(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder;
        for (String word : words) {
            stringBuilder = new StringBuilder(word);
            if (word.equalsIgnoreCase(stringBuilder.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
