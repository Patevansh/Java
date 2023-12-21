package assingment;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.insert(5, " Java");
        stringBuilder.delete(5, 10);
        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());
    }
}
