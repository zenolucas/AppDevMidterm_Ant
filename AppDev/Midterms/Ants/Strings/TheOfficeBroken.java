package Strings;

public class TheOfficeBroken {
    public static String broken(final String x) {
        String answer = "";

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '0') {
                answer += "1";
            } else {
                answer += "0";
            }
        }
        return answer;
    }
}
