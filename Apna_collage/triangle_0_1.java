public class triangle_0_1 {
    public static void main(String[] args) {
        tri(5);
    }
    static void tri(int k){
        int n=1;
        int f=0;
        for(int i=0;i<k;i++){
            n=f;
            f=1-f;
            for(int j=0;j<=i;j++){
                if(n==1){
                    n=0;
                }
                else{
                    n=1;
                }
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
