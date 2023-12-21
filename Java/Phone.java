package Java;
public class Phone{
    public static void main(String[] args){
        Call c=new Call();
        c.use();
    }
}
class Call{
    void use(){
        Smartphone s=new Smartphone();
        s.on();
        s.calling();
        s.messege();
        s.music_player();
        s.camera();
        s.facebook();
        s.gaming();
        s.video_call();
        s.off();
    }
}
class Mobile{
    void on(){
        System.out.println("Mobile turning on.");
    }
    void calling(){
        System.out.println("Calling a person.");
    }
    void messege(){
        System.out.println("Messeging a person.");
    }
    void music_player(){
        System.out.println("Playing a music.");
    }
    void off(){
        System.out.println("Turning off mobile.");
    }
}
class Smartphone extends Mobile{
    void camera(){
        System.out.println("Opening camera.");
    }
    void gaming(){
        System.out.println("Playing game.");
    }
    void video_call(){
        System.out.println("Video calling a person.");
    }
    void facebook(){
        System.out.println("Using facebook.");
    }
}


