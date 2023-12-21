package Java;
class Car {
    public static void main(String[] args){
       Call c=new Call();
       c.use();
    }
}
class Call{
    void use(){
        Vehicle v=new Vehicle();
        v.ignition();
        v.drive();
        v.breake();
        v.park();
        System.out.println("Car details:");
        v.main();
    }
}

class Vehicle extends Java.Testin{
    void ignition(){
        System.out.println("Start the car.");
    }
    public void main() {
    }
    void drive(){
        System.out.println("Drive the car.");
    }
    void breake(){
        System.out.println("Apply the break.");
    }
    void park(){
        System.out.println("Park the car.");
    }

}
