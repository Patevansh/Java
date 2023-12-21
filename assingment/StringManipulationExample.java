package assingment;
public class StringManipulationExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7, 12));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Replace: " + str.replace('l', 'x'));
    }
}
