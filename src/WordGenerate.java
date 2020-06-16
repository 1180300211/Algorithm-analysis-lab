import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
public class WordGenerate {
    public static void sort() throws IOException {
        List<String> words = new ArrayList<String>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while ((line = reader.readLine()) != null)
        {
            words.add(line);
        }
        reader.close();

        Collections.sort(words);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
        for (String w : words)
        {
            writer.write(w);
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    static String fileName=TestConfig.fileName;

    public static void main(String[] args) throws Exception{
        File myFile = new File(fileName);
        if(myFile.exists()){
            myFile.delete();
            myFile = new File(fileName);
        }
        FileWriter fileWritter = new FileWriter(myFile.getName(),true);

        for(int i = 0; i<=TestConfig.getSize(); i++){
            long len=System.currentTimeMillis()%10;
            fileWritter.write(RandomStringUtils.randomAlphanumeric(TestConfig.len)+"\n");
        }
        sort();
    }
}
