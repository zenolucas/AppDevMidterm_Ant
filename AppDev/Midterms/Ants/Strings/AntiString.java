package Strings;

public class AntiString {
    public static String antiString(String str){
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()){
            int transformedChar = (c < 'A') ? 105 - c : 187 - c;
            result.append((char) transformedChar);
        }
        return result.reverse().toString();
    }
}
