package Strings;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int num = strarr.length;
        if (num == 0 || k > num || k <= 0) {
            return "";
        }

        StringBuilder long_string = new StringBuilder();
        int max = 0;

        for (int i = 0; i <= num - k; i++) {
            StringBuilder curr = new StringBuilder();
            for (int j = 0; j < k; j++) {
                curr.append(strarr[i + j]);
            }
            if (curr.length() > max) {
                long_string = curr;
                max = curr.length();
            }
        }

        return long_string.toString();
    }
}
