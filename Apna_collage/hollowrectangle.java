public class hollowrectangle {
    public static void main(String[] args) {
        printrec(5,4);
    }
    static void printrec(int l,int b){
        for(int i=0;i<=l;i++){
            for(int j=0;j<=b;j++){
                if(i==0 || i==l || j==0 || j==b){
                    System.out.print("x");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
