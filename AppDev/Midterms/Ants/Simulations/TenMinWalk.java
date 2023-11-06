package Simulations;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int vertical = 0; // Positive for north, negative for south
        int horizontal = 0; // Positive for east, negative for west

        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'e':
                    horizontal++;
                    break;
                case 'w':
                    horizontal--;
                    break;
                default:
                    return false; // Invalid direction
            }
        }

        return vertical == 0 && horizontal == 0;
    }
}