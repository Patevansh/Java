package Java;

import java.util.Scanner;
class QueueWithStack{
    public static void main(String args[]){
        QueueWithStack1 Q=new QueueWithStack1();
        Q.main();
    }
}

class QueueWithStack1{
    static int arr[]=new int[30];
    void main(){

        try (Scanner sc = new Scanner(System.in)) {
            QueueWithStack1 stack = new QueueWithStack1();
            stack.Stack1(15);
            int choice;

            while (true) {

                System.out.println("|1. Push                    |");
                System.out.println("|2. Pop from top            |");
                System.out.println("|3. Peek from top           |");
                System.out.println("|4. Display from top        |");
                System.out.println("|5. Pop from down           |");
                System.out.println("|6. Peek from down          |");
                System.out.println("|7. Display from down       |");
                System.out.println("|8. Exit                    |");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();


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
                        data=stack.popend();
                        if (data != -1) {
                            System.out.println("Popped data: " + data);
                        }
                        break;
                    case 6:
                        data=stack.peekend();
                        if (data != -1) {
                            System.out.println("End data: " + data);
                        }
                        break;
                    case 7:
                        stack.displayend();
                        break;
                    case 8:
                        System.out.println("Exiting code");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }

    int top;
    int end;
    public void Stack1(int size) {
        arr = new int[size];
        top = -1;
        end = 0;

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


        public int popend() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                int data = arr[end];
                for(int i=0;i<top;i++){
                    arr[i]=arr[i+1];
                }
                top--;
                return data;
            }
        }

        public int peekend() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return arr[end];
            }
        }

        public void displayend() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                for (int i =end; i <=top; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
}