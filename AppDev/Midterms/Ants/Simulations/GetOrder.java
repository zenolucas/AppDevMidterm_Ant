package Simulations;

public class GetOrder {
    public static String getOrder(String input) {
        char[] arr = input.toCharArray();
        StringBuilder result = new StringBuilder();
        int burger = 0;
        int milkshake = 0;
        int pizza = 0;
        int chicken = 0;
        int fries = 0;
        int coke = 0;
        int sandwich = 0;
        int onionrings = 0;
        for (int x=0; x<arr.length; x++){ result.append(arr[x]);
            switch (result.toString()) {
                case ("burger") -> {
                    result = new StringBuilder();
                    burger++;
                }
                case ("milkshake") -> {
                    result = new StringBuilder();
                    milkshake++;
                }
                case ("pizza") -> {
                    result = new StringBuilder();
                    pizza++;
                }
                case ("chicken") -> {
                    result = new StringBuilder();
                    chicken++;
                }
                case ("fries") -> {
                    result = new StringBuilder();
                    fries++;
                }
                case ("coke") -> {
                    result = new StringBuilder();
                    coke++;
                }
                case ("sandwich") -> {
                    result = new StringBuilder();
                    sandwich++;
                }
                case ("onionrings") -> {
                    result = new StringBuilder();
                    onionrings++;
                }
            }
        }
        StringBuilder str = new StringBuilder(); while (burger!=0) {
            str.append("Burger ");
            burger--;
        }
        while (fries!=0) {
            str.append("Fries ");
            fries--;
        }
        while (chicken!=0) {
            str.append("Chicken ");
            chicken--;
        }
        while (pizza!=0) {
            str.append("Pizza ");
            pizza--;
        }
        while (sandwich!=0) {
            str.append("Sandwich ");
            sandwich--;
        }
        while (onionrings!=0) {
            str.append("Onionrings ");
            onionrings--;
        }
        while (milkshake!=0) {
            str.append("Milkshake ");
            milkshake--;
        }
        while(coke!=0){
            str.append("Coke");
            coke--;
        }
        String output=str.toString(); return output.trim();
    }
}

