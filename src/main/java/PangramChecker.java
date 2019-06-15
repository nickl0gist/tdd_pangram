import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        String checker = "abcdefghijklmnopqrstuvwxyz";
        boolean res = true;
        input = input.toLowerCase();

        for (int i = 0; i < checker.length(); i++) {
            if(!input.contains(Character.toString(checker.charAt(i)))){
                res = false;
                break;
            }
        }
        return res;
    }

}
