import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> childdren;
    boolean wordEnd;

    public TrieNode() {
        childdren = new HashMap<Character, TrieNode>();
        wordEnd = false;
    }
}