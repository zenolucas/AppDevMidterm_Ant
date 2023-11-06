package Simulations;

public class BouncingBalls {
    public static int bouncingBalls(double h, double bounce, double window){
        if(h <= 0 || bounce <= 0 || bounce >= 1 || window >= h){
            return -1;
        }
        int count = 1;
        while ((h *= bounce) > window){
            count += 2;
        }
        return count;
    }
}
