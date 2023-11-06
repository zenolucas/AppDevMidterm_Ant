package Mathematics;

/**
 * The CalculateAverage class provides a method to calculate the average of an array of integers.
 */
public class CalculateAverage {
    
    /**
     * Calculates the average of an array of integers.
     * 
     * @param array the array of integers to calculate the average of
     * @return the average of the array as a double
     */
    public static double find_average(int[] array){
        double sum = 0;
        double ave = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
            ave = sum/array.length;
        }
        return ave;
    }
}
