
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class DATmain {

        public static void main(String[] args) throws Exception
        {

            BufferedReader reader = new BufferedReader(new FileReader(TestConfig.getFileName()));
            String line;
            List<String> words = new ArrayList<String>();
            while ((line = reader.readLine()) != null)
            {
                words.add(line);
            }
            reader.close();
            DoubleArrayTrie dat = new DoubleArrayTrie();
            System.out.println("是否错误: " + dat.build(words));
            System.out.println(dat);
            System.out.println(words.size());
            new Thread().sleep(100000);
        }
    }

