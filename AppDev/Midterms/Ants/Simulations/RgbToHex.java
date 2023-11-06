package Simulations;

public class RgbToHex {
    static String rgb(int r, int g, int b){
        int[] rgbValues = {r,g,b};

        StringBuilder hexBuilder = new StringBuilder();
        for (int value: rgbValues){
            int clampedValue = Math.min(Math.max(value, 0), 255);
            String hexComponent = Integer.toHexString(clampedValue).toUpperCase();
            if(hexComponent.length() == 1){
                hexBuilder.append('0');
            }
            hexBuilder.append(hexComponent);
        }
        return hexBuilder.toString();
    }
}
