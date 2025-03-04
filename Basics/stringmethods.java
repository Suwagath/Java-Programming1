package Basics;

public class stringmethods {
    public static void main(String[] args) {
        String name = "Alexander Graham bell";
        System.out.println("Name " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last char: " + (name.charAt(name.length() - 1)));
        System.out.println("Substring: " + name.substring(9));
    }
}
