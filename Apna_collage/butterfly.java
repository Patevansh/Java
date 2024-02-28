public class butterfly {
    public static void main(String[] args) {
        butter();
    }
    static void butter(){
        for(int i=0;i<6;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            for(int k=10;k>=i*2;k--){
                System.out.print(" ");
            }
            for(int m=0;m<=i;m++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=i*2;k<=10;k++){
                System.out.print(" ");
            }
            for(int m=i;m>=0;m--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
