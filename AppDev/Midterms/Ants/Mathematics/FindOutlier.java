package Mathematics;

/**
 * This class contains a static method that finds the outlier in an array of integers.
 * An outlier is defined as the integer that differs in parity (evenness or oddness) from the others.
 */
public class FindOutlier {
    /**
     * Finds the outlier in an array of integers.
     * @param integers the array of integers to search for an outlier
     * @return the outlier integer
     */
    static int find (int[] integers){
        int oddCount = 0;
        int evenCount = 0;
        int lastOdd = 0;
        int lastEven = 0;

        for (int i: integers){
            if (i % 2 == 0){
                evenCount++;
                lastEven = 1;
            } else {
                oddCount ++;
                lastOdd = 1;
            }
            if (evenCount > 1 && oddCount ==1){
                return lastOdd;
            } else if (oddCount > 1 && evenCount ==1) {
                return lastEven;
            }
        }
        return 0;
    }
}
