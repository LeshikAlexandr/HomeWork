package lessons11.one;

import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("TextThree.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("TextThreeNew.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;
        StringBuilder stringBuilder;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder = new StringBuilder(line);
            if (line.equals(stringBuilder.reverse().toString())) {
                bufferedWriter.write(line + "\n");
            }
        }
        bufferedWriter.close();
    }
}
