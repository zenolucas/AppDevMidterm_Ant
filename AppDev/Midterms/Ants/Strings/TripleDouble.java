package Strings;

public class TripleDouble
{
    public static int TripleDouble(long num1, long num2)
    {
        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);

        for (int i = 0; i < num1Str.length() - 2; i++) {
            char digit1 = num1Str.charAt(i);
            char digit2 = num1Str.charAt(i + 1);
            char digit3 = num1Str.charAt(i + 2);

            if (digit1 == digit2 && digit2 == digit3) {
                if (num2Str.contains("" + digit1 + digit1)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
