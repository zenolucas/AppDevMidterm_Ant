package Mathematics;

/**
 * The SmallestIntegerFinder class contains a static method that finds the smallest integer in an array of integers.
 */
public class SmallestIntegerFinder {

    /**
     * Finds the smallest integer in an array of integers.
     *
     * @param args the array of integers to search
     * @return the smallest integer in the array
     */
    public static int findSmallestInt(int[] args) {
        int temp = 999999;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < temp) {
                temp = args[i];
            }
        }
        return temp;
    }
}
