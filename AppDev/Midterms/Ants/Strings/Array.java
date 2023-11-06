package Strings;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        for (int num : a) {
            boolean isPresentInB = false;
            for (int bNum : b) {
                if (num == bNum) {
                    isPresentInB = true;
                    break;
                }
            }

            if (!isPresentInB) {
                result.add(num);
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;

    }

}