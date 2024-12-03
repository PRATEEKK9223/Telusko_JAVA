class M{
    public void show(){
        System.out.println("inside M class");
    }
}

class N extends M{
    public void show(){
        System.out.println("inside N class");
    }
}

public class methodsOverriding {
    public static void main(String a[]){
        N obj =new N();
        obj.show();
    }
}
