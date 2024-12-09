abstract class Car{
    public abstract void drive();
    public abstract void fly();
}

class toyoto extends Car{
    public void drive(){
        System.out.println("driving...");
    }
    public void fly(){
        System.out.println("flying...");
    }
}



public class Abstract {
    public static void main(String[] arg){
        Car obj =new toyoto();
        obj.drive();
        obj.fly();
    }
    
    
}
