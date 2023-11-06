package Mathematics;

/**
 * The Handshakes class provides a static method to calculate the number of participants in a handshake scenario.
 */
public class Handshakes {
    
    /**
     * Calculates the number of participants in a handshake scenario given the number of handshakes.
     * 
     * @param handshakes the number of handshakes
     * @return the number of participants
     */
    public static int GetParticipants(int handshakes) {

        if (handshakes == 0) {
            return 0;
        }

        double ans = (1 + Math.sqrt(1 + 8 * handshakes)) / 2;
        int answer = (int)Math.ceil(ans);

        return answer;
    }
}
