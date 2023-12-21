package Java;

import java.util.Scanner;

public class Queue {
    public void main() {
        System.out.println("          |----------------------------|");
        System.out.println("          |           QUEUE            |");
        System.out.println("          |----------------------------|");
        try (Scanner Sc = new Scanner(System.in)) {
            int Array[]=new int[15];
            int Ch = 0,i=0;
            while (Ch < 5) {
                System.out.println("|------------------|");
                  System.out.print("|1)Add             |" +
                                 "\n|2)Remove          |" +
                                 "\n|3)Display         |" +
                                 "\n|4)Exit            |" +
                                 "\n|------------------|"+
                        "\nEnter your choice:");
                Ch = Sc.nextInt();
                System.out.println("----------------------");
                switch (Ch){
                    case 1:
                        System.out.print("Enter a element:");
                        Array[i]=Sc.nextInt();
                        i++;
                        break;
                    case 2:
                        if(i==0){
                            System.out.println("Queue is Empty");
                            break;
                        }
                        else{
                            System.out.println("Removed element is "+Array[0]);
                            for(int j=0;j<i;j++){
                                Array[j]=Array[j+1];
                            }
                            i--;
                            break;
                        }
                    case 3:
                        if(i==0){
                            System.out.println("Queue is Empty");
                            break;
                        }
                        else{
                            System.out.print("Queue Element:");
                            for(int j=0;j<i;j++){
                                System.out.print(" "+Array[j]);
                            }
                            System.out.println();
                            break;
                        }
                    case 4:
                        return;
                    default:
                        System.out.println("Wrong input\nWrite a valid input");
                        Ch=0;
                }
            }
        }
    }
}