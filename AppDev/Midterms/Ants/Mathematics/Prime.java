package Mathematics;

/**
 * The Prime class provides a method to check if a given integer is a prime number.
 */
public class Prime {
    
    /**
     * Returns true if the given integer is a prime number, false otherwise.
     * 
     * @param num the integer to check for primality
     * @return true if the given integer is a prime number, false otherwise
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}