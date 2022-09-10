import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set = new HashSet<>();

    public WordsChecker(String text){
        this.text = text.toLowerCase();
        this.set.addAll(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord(String input){
        return set.contains(input.toLowerCase().trim());
    }

}
