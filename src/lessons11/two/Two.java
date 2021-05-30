package lessons11.two;

import lessons9.TwoTextFormatter;

import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("TextFour.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("TextFourNew.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] sentences = line.split("\\. ");
            for (int i = 0; i < sentences.length; i++) {
                int countOfWords = TwoTextFormatter.checkSentence(sentences[i]);
                if (TwoTextFormatter.checkPalindrome(sentences[i])) {
                    bufferedWriter.write(sentences[i] + (i != sentences.length - 1 ? ". " : ""));
                    continue;
                }
                if (countOfWords >= 3 && countOfWords <= 5) {
                    bufferedWriter.write(sentences[i] + (i != sentences.length - 1 ? ". " : ""));
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
