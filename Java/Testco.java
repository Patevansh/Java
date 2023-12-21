package Java;

class Testco {
    public static void main(String[] args){
        M2 m=new M2(1);
        M4 mm=new M4();
    }
}
class M1{
    M1(){
        System.out.println("First");
    }
}
class M2 extends M1{
    M2(int a){
        System.out.println("Second");
    }
}
class M3{
    M3(){
        System.out.println("Third");
    }
}
class M4 extends M3{
    }
