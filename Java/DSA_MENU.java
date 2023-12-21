package Java;
import java.util.Scanner;

public class DSA_MENU {
    public void Input() {
        int Ta = 0;
        try (Scanner Sc = new Scanner(System.in)) {
            Array_task A=new Array_task();
            Queue Q=new Queue();
            Stack S=new Stack();
            while (Ta < 3) {
                System.out.println("          |-----------------------------------|            ");
                System.out.println("          |MENU DRIVEN PROGRAM FOR DSA IN JAVA|            ");
                System.out.println("          |-----------------------------------|            ");
                System.out.println("|------------|");
                  System.out.print("| 1)Array    |" +
                                 "\n| 2)Stack    |" +
                                 "\n| 3)Queue    |" +
                                 "\n| 4)exit     |" +
                                 "\n|------------|" +
                                 "\nSelect a task to perform:");
                Ta = Sc.nextInt();
                System.out.println("-------------------------------");
                switch (Ta){
                    case 1:
                        A.main();
                        Ta=0;
                        break;
                    case 2:
                        S.main();
                        Ta=0;
                        break;
                    case 3:
                        Q.main();
                        Ta=0;
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input\nTry again");
                        Ta=0;
                }
            }
        }
    }
}
