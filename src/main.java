import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class main {




    public static void main(String[] args)throws Exception {
        Trie trie=new Trie();
        File file1 = new File("English_Names_Corpus（2W）.txt");
        File file2 = new File(TestConfig.getFileName());
        BufferedReader reader = new BufferedReader(new FileReader(file2));
        String str;
        int count=0;
        List<String> words = new ArrayList<String>();
        while((str=reader.readLine())!=null){
            System.out.println(str);
            trie.insert(str);
            words.add(str);
            count++;
            System.out.println( count);
        }
        new Thread().sleep(100000);


    }
}
