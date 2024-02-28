public class nullpointerexception {
    void func1(){
        System.out.println("working");
    }
    public static void main(String args[]){
        nullpointerexception obj = null;
        obj = new nullpointerexception();
        obj.func1();
    }
}
