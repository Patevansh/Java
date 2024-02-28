class stringcompration{
    public static void main(String[] args) {
        String s="aaabbbccccddc";
        strcom(s);
    }
    static void strcom(String s){
        int t=0,n=0;
        String out="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                t+=1;
            }
            else{
                if(t==0){
                    out+=s.charAt(i);
                }
                else{
                    Integer temp=t+1;
                    t=0;
                    temp.toString();
                    out=out+s.charAt(i)+temp;
                }
            }
            n=i;
        }
        if(s.charAt(n)==s.charAt(n+1)){
            t+=1;
        }
        if(t==0){
            out+=s.charAt(n+1);
        }
        else{
            Integer temp=t+1;
            t=0;
            temp.toString();
            out=out+s.charAt(n)+temp;
        }
        System.out.println(out);
    }
}