package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order (String words){
        if (words == null || words.isEmpty()){
            return "";
        }
        String[] wordArray = words.split(" ");
        Arrays.sort(wordArray, Comparator.comparing(s -> Integer.parseInt(s.replaceAll("\\D", ""))));

        return String.join(" ", wordArray);
    }
}
