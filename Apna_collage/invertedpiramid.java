public class invertedpiramid {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        invertedpiramid i = new invertedpiramid(5);
    }
    invertedpiramid(int l){
        for(int i =l;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
