package Mathematics;

/**
 * The DigPow class contains a static method that calculates the Digitial Power of a given number.
 * 
 * <p>The Digitial Power of a number is the sum of its digits raised to a given power. If the result is divisible by the original number, then the quotient is returned. Otherwise, -1 is returned.</p>
 */
public class DigPow {

    /**
     * Calculates the Digitial Power of a given number.
     * 
     * @param n the number to calculate the Digitial Power of
     * @param p the power to raise the digits to
     * @return the quotient if the sum of the digits raised to the power is divisible by the original number, otherwise -1
     */
    public static long digPow(int n, int p) {
        String numbers = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < numbers.length(); i++) {
            int num = Character.getNumericValue(numbers.charAt(i));
            sum += Math.pow(num, p + i);
        }

        if (sum % n == 0) {
            return sum / n;
        }

        return -1;
    }
}