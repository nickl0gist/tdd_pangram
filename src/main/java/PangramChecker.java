import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    private static final Set<Character> ALPHABET = new HashSet<>();
    static {
        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            ALPHABET.add(c);
        }
    }

    public boolean isPangram(String input) {
        Set<Character> in = new HashSet<>();
        for (char c: input.toLowerCase().toCharArray()){
            in.add(c);
        }
        return in.containsAll(ALPHABET);
    }

}
