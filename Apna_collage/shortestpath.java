public class shortestpath {
    public static void main(String[] args) {
        String s="WNEENESENNN";
        path(s);
    }
    static void path(String str){
        int n=0,s=0,e=0,w=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                if (s==0){
                    n+=1;
                }
                else{
                    s-=1;
                }
            }
            else if(str.charAt(i)=='S'){
                if (n==0){
                    s+=1;
                }
                else{
                    n-=1;
                }
            }
            else if(str.charAt(i)=='E'){
                if (w==0){
                    e+=1;
                }
                else{
                    w-=1;
                }
            }
            else if(str.charAt(i)=='W'){
                if (e==0){
                    w+=1;
                }
                else{
                    e-=1;
                } 
            }
        }
        int up=(s+n)*(s+n);
        int down=(w+e)*(w+e);
        int t=up+down;
        System.out.println("Shortest distance is: "+Math.sqrt(t));
    }
}
