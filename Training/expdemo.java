import java.util.Scanner;

class expdemo{
	void func1(){
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter I value:");
			int var1 = sc.nextInt();

			System.out.println("Enter II value:");
			int var2 = sc.nextInt();

			try{int res = var1/var2;
			System.out.println("Division: "+res);
		    }
			catch(ArithmeticException e){
				System.out.println(e);
				System.out.println(e.getMessage());
			}
			//can a single catch block contain more than one exception class
			//yes with using bitwise or(|) opreator 
			//description : this feature has been implemented in java from jdk 7. 
			catch(Exception x){
				System.out.println(x);
			}
			finally{
				System.out.println("Finally ....");
			}
	}
	}
	void func2(){
	    System.out.println("second fn is working");
	}
	public static void main(String args[]){
	    expdemo obj = new expdemo();
	    obj.func1();
	    obj.func2();
	}
}
