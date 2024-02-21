public class numberexample {
    static public void main(String...args){
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String str =sc.next();
            System.out.println("-------String value--------");
            System.out.println(str);

            System.out.println("-------- -------");
            System.out.println("--------Numeric value--------");
            int z = Integer.parseInt(str); // convert only integer if other error
            System.out.println(z);
        }
    }
}
