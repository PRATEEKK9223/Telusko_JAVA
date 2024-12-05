//this class can not extend that anywhere
final class laptop{
    final int price =1000;
    int code=45;

    //this method we cannot override that 
    public final void show(){
        System.out.println("in laptop");
        //price=200; it is not posible because now it is constant
        code=18;
    }
}

class tab extends laptop{
    public void show(){
        System.out.println("in mobile");
    }
}


public class finalKeyword {
    public static void main(){
        tab obj =new tab();
        obj.show();
    }
    
}
