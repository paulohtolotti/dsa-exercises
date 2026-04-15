import java.text.Collator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {

    public static String normalize(String text) {
        Pattern pattern = Pattern.compile("[^\\p{L}\\p{N}\\s]", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);
        String words = matcher.replaceAll(" ");
        return words.replaceAll("\\s+", " ").trim().toLowerCase();
    }

    public static void main(String[] args) {
        String input = "O vento sussurra sons entre as árvores, sons que fazem animais correrem. A floresta e a natureza vibram com segredos e sons.";
        wordCount(input);
    }

    public static void wordCount(String text) {
        Map<String, Rank> wordRank = new TreeMap<>();

        for(String word : text.split(" ")) {
            String normalizedWord = normalize(word);

            if(!wordRank.containsKey(normalizedWord)) {
                Rank obj = new Rank(normalizedWord);
                wordRank.put(normalizedWord, obj);

            } else {
                Rank obj = wordRank.get(normalizedWord);
                obj.updateFrequency();
                wordRank.replace(normalizedWord, obj);

            }
        }

        List<Rank> rankList = wordRank.values().stream().toList();
        rankList = sort(rankList);
        rankList.forEach(System.out::println);

    }

    public static List<Rank> sort(List<Rank> l) {
        return l.stream().sorted().toList();
    }
}
