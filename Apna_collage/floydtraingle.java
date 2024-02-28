public class floydtraingle {
    public static void main(String[] args) {
        tri(5);
    }
    static void tri(int k){
        int n=1;
        for(int i=0;i<k;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
