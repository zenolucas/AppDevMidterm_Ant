package Mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * The DeadFish class provides a static method to parse a string of commands and return an array of integers.
 * The commands are as follows:
 * - 'i': increment the current number by 1
 * - 'd': decrement the current number by 1
 * - 's': square the current number
 * - 'o': output the current number and add it to the result array
 */
public class DeadFish {
    /**
     * Parses a string of commands and returns an array of integers.
     *
     * @param data the string of commands to parse
     * @return an array of integers representing the output of the commands
     */
    public static int[] parse(String data) {
        int num = 0;
        List<Integer> result = new ArrayList<>();

        for (char command : data.toCharArray()) {
            switch (command) {
                case 'i':
                    num++;
                    break;
                case 'd':
                    num--;
                    break;
                case 's':
                    num = num * num;
                    break;
                case 'o':
                    result.add(num);
                    break;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
