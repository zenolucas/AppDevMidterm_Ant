package Strings;

public class Hello {
    public String sayHello(String [] name, String city, String state){
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < names.length(); i++){
            names.append(name[i] + " ");
        }
        String allNames = names.toString();
        return "Hello, " + allNames.trim() + "! Welcome to " + city + ", " + state + "!";
    }
}
