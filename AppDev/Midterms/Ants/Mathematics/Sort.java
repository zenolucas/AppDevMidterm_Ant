package Mathematics;

import java.util.Arrays;
/**
 * The Sort class provides a static method to sort an array of integers in ascending order,
 * with odd numbers appearing first, followed by even numbers.
 */
public class Sort {
    
    /**
     * Sorts an array of integers in ascending order, with odd numbers appearing first, followed by even numbers.
     * 
     * @param array the array of integers to be sorted
     * @return the sorted array of integers
     */
    public static int[] sortArray(int[] array) {
        int[] odd = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
        int odd_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odd[odd_index];
                odd_index++;
            }
        }
        return array;
    }
}