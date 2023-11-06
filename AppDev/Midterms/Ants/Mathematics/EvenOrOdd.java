package Mathematics;

/**
 * The EvenOrOdd class contains a method to determine whether a given integer is even or odd.
 */
public class EvenOrOdd {
    
    /**
     * Determines whether a given integer is even or odd.
     * 
     * @param number the integer to be checked
     * @return "Even" if the number is even, "Odd" if the number is odd
     */
    public static String even_or_odd(int number) {
        if (number % 2 == 0)
            return "Even";
        else 
            return "Odd";
    }
}

