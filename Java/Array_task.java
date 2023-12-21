package Java;
import java.util.Scanner;

public class Array_task {
static int s=50;
static int m=0;
   public void main() {
       System.out.println("          |----------------------------|");
       System.out.println("          |           ARRAY            |");
       System.out.println("          |----------------------------|");
        Scanner sc = new Scanner(System.in);
        Array_task A=new Array_task();

        int[] array = new int[s];
        int choice=0;

        while (choice<7) {
            System.out.println("|----------------------------------|");
            System.out.println("|1. Add element to array           |");
            System.out.println("|2. Print array                    |");
            System.out.println("|3. Remove element from array      |");
            System.out.println("|4. Search element in array        |");
            System.out.println("|5. Swapping in array              |");
            System.out.println("|6. Exit                           |");
            System.out.println("|----------------------------------|");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("------------------------------------");
            switch (choice) {
                case 2:
                    A.printArray(array);
                    break;
                case 1:
                    A.addElement(array, sc);
                    break;
                case 3:
                    A.removeElement(array, sc);
                    break;
                case 4:
                    A.searchElement(array, sc);
                    break;
                case 5:
                    A.swapping(array);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    System.out.print("Enter a valid choice: ");
                    choice = sc.nextInt();
            }
        }
    }
    void printArray(int[] array) {
        for (int i = 0; i < m; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

void addElement(int[] array, Scanner sc) {
        System.out.print("Enter the element to add: ");
        int element = sc.nextInt();
        array[m] = element;
        m++;
    }

void removeElement(int[] array, Scanner sc) {
        System.out.print("Enter the element to remove: ");
        int element = sc.nextInt();
        if(m==0){
            System.out.println("Empty array");
        }
        else{for (int i = 0; i < m; i++) {
            if (array[i] == element) {
                array[i] = array[m - 1];
                array[m - 1] = 0;
                m--;
                break;
            }
        }
        }
    }
void searchElement(int[] array, Scanner sc) {
        System.out.print("Enter the element to search: ");
        int element = sc.nextInt();

        int index = -1;
        for (int i = 0; i < m; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
    void swapping(int array[]){

       if(m==0){
            System.out.println("Empty array");
        }
        else{for (int i = 0; i < m/2; i++) {
           int temp=array[i];
           array[i]=array[m-i-1];
           array[m-1-i]=temp;
            }
           System.out.println("Array swapped");
        }
        }
    }
