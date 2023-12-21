package Java;
public class Testin {
    public void main() {
        Electric E = new Electric();
        E.old();
        E.newcar();
        E.smartcar();
        E.electric();
    }

}
class OldCar{
    String old="Honda city";
    void old(){

        System.out.println("Old Car is "+old);
    }
}
class Newcar extends OldCar{
    String newc="Toyota Fortuner";
    void newcar(){

        System.out.println("New car is "+newc);
    }
}
class SmartCar extends Newcar{
    void smartcar(){
        System.out.println("New car converted to smart automatic car "+newc);
    }
}
class Electric extends SmartCar{
    void electric(){
        System.out.println("Smart car and new car make electric car "+newc);
    }
}