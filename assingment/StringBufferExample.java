package assingment;
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        stringBuffer.insert(5, " Java");
        stringBuffer.delete(5, 10);
        stringBuffer.reverse();

        System.out.println(stringBuffer.toString());
    }
}

