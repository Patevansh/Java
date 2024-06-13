package Java;
import java.lang.Math;
import java.util.Scanner; 

class Prime_Number{
    public static void main(String[] args) {
        Prime_Number p = new Prime_Number();
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int a=Sc.nextInt();
            System.out.println(p.isprime(a));
        }
    }
    boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}