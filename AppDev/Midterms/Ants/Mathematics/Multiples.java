package Mathematics;

/**
 * The Multiples class contains a method to calculate the sum of all the multiples of 3 or 5 below a given number.
 */
public class Multiples {
    
    /**
     * Calculates the sum of all the multiples of 3 or 5 below the given number.
     * 
     * @param number the upper limit of the range to check for multiples of 3 or 5
     * @return the sum of all the multiples of 3 or 5 below the given number
     */
    public int multiplesOf3or5(int number) {
        int ans = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                ans += i;
            }
        }
        return ans;
    }
}
