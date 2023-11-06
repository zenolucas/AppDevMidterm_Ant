package Strings;

public class StringyStrings {
    public static String stringy(int size) {
        String answer = "";

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                answer += "1";
            } else {
                answer += "0";
            }
        }
        return answer;
    }
}
