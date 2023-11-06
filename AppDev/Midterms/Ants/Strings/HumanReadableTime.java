package Strings;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            throw new IllegalArgumentException("Invalid input: must not exceed 99:59:59");
        }
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
    }
}
