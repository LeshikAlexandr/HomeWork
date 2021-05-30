package lessons11.three;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Reader {

    public void read() {
        try (BufferedReader bf = new BufferedReader(new FileReader("Lesson11Text.txt"))) {
            String line = "";
            while ((line = bf.readLine()) != null) {
                List<String> sentences = checkLine(line);
//                System.out.println(sentences);
                List<String> list;
                for (String sentence : sentences) {
                    sentence = sentence.trim();
                    list = checkSentence(sentence);
                    if (printSentences(list)) {
                        System.out.println(sentence);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> checkLine(String line) {
        List<String> list = new ArrayList<>();
        String regex = "!.?";
        StringTokenizer str = new StringTokenizer(line, regex);
        while (str.hasMoreTokens()) {
            list.add(str.nextToken());
        }
        return list;
    }

    private List<String> checkSentence(String sentence) {
        List<String> list = new ArrayList<>();
        String regex = "[,@ ]";
        StringTokenizer str = new StringTokenizer(sentence, regex);
        while (str.hasMoreTokens()) {
            list.add(str.nextToken());
        }
        return list;
    }

    private boolean printSentences(List<String> checkList) {
        for (String checkWord : checkList) {
            try (BufferedReader bf = new BufferedReader(new FileReader("Lesson11WordsToCheck.txt"))) {
                String word = "";
                while ((word = bf.readLine()) != null) {
                    if (checkWord.equalsIgnoreCase(word)) {
                        return false;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
