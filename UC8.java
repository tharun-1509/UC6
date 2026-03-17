import java.util.HashMap;
import java.util.Map;

public class UC8 {
    public static Map<Character, String[]> getCharacterPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();
        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
        return patterns;
    }
    public static void printBanner(String word, Map<Character, String[]> patterns) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                line.append(pattern[row]).append("  ");
            }
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> patterns = getCharacterPatterns();
        String message = "OOPS";
        printBanner(message, patterns);
    }
}