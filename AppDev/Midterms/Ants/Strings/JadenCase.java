package Strings;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }

        String[] phr = phrase.split(" ");
        String answer = null;
        StringBuilder stringBuilder;
        for (String word : phr) {
            stringBuilder = new StringBuilder(word);
            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
            answer += stringBuilder.toString() + " ";
        }

        // to remove last space in the string
        StringBuffer sb = new StringBuffer(answer);
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
