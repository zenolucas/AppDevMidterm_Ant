package Strings;

public class Vowels {
    public static int getCount(String str) {
        String[] stringArray = str.split("");
        int count = 0;
        for (String s : stringArray) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                count++;
            }
        }
        return count;
    }
}
