package Java;
import java.util.Scanner;
public class Stack {
public void main() {
    System.out.println("          |----------------------------|");
    System.out.println("          |           STACK            |");
    System.out.println("          |----------------------------|");
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        stack.Stack1(15);
        int choice;

        while (true) {
            System.out.println("|-----------------|");
            System.out.println("|1. Push          |");
            System.out.println("|2. Pop           |");
            System.out.println("|3. Peek          |");
            System.out.println("|4. Display       |");
            System.out.println("|5. Exit          |");
            System.out.println("|-----------------|");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("------------------- -------");
            switch (choice) {
                case 1:
                    System.out.print("Enter the data to be pushed: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    data = stack.pop();
                    if (data != -1) {
                        System.out.println("Popped data: " + data);
                    }
                    break;
                case 3:
                    data = stack.peek();
                    if (data != -1) {
                        System.out.println("Top data: " + data);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    int[] arr;
    int top;

    public void Stack1(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int data = arr[top];
            arr[top--] = 0;
            return data;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}