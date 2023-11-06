package Mathematics;

/**
 * The Billboard class contains a method to calculate the total cost of a billboard advertisement based on the length of the name and the price per day.
 */
public class Billboard {
    
    /**
     * Calculates the total cost of a billboard advertisement based on the length of the name and the price per day.
     * @param name the name to be displayed on the billboard
     * @param price the price per day of the billboard advertisement
     * @return the total cost of the billboard advertisement
     */
    public static int billboard(String name, int price) {
        int total = 0;
        for (int i = 0; i < price; i++)
        {
            total += name.length();
        }
        return total;
    }
}