package assingment;
class Outer {
    private int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("Value of outerVar: " + outerVar);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}

