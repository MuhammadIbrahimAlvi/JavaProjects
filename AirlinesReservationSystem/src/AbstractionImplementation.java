
public class AbstractionImplementation {
    public static void main(String[] args){
        Child objectChild = new Child();
        objectChild.speakLanguage();
    }
}

interface Human{
    void heartBeat();
    void brainPluses();
}

abstract class Men implements Human{
    abstract void speakLanguage();
}

class Child extends Men{
    private static Child instance_Men = new Child();
    void speakLanguage(){
        System.out.println("Language is Python");
    }
    public void heartBeat(){
        System.out.println("Heart Beating");
    }
    public void brainPluses(){
        System.out.println("Brain Pluses Circulating");
    }
    public Child getInstance(){
        if(instance_Men == null){
            return instance_Men = new Child();
        }
        return instance_Men;
    }
}
